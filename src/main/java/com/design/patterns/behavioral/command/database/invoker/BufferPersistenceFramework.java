package com.design.patterns.behavioral.command.database.invoker;

import com.design.patterns.behavioral.command.database.command.BatchSaveCommand;
import com.design.patterns.behavioral.command.database.command.ICommand;
import com.design.patterns.behavioral.command.database.command.SaveCommand;
import com.design.patterns.behavioral.command.database.receiver.Database;
import com.design.patterns.behavioral.command.database.receiver.IDatabase;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class BufferPersistenceFramework implements PersistenceFramework {

    private final List<ICommand> commandBuffer;
    private final int bufferSize;
    private final IDatabase database;

    public BufferPersistenceFramework() {
        this.bufferSize = 3;
        this.commandBuffer = new ArrayList<>(bufferSize);
        this.database = new Database();
    }

    @Override
    public void save(String data) {
        if (commandBuffer.size() == bufferSize - 1) {
            log.info("Buffer is full. Flushing data: {}", commandBuffer);
            commandBuffer.forEach(ICommand::execute);
            commandBuffer.clear();
        } else {
            commandBuffer.add(new SaveCommand(database, data));
        }
    }

    @Override
    public void batchSave(List<String> data) {
        new BatchSaveCommand(database, data).execute();
    }
}
