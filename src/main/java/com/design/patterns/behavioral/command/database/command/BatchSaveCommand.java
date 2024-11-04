package com.design.patterns.behavioral.command.database.command;

import com.design.patterns.behavioral.command.database.receiver.IDatabase;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BatchSaveCommand implements ICommand {

    private final IDatabase database;
    private final List<String> data;

    @Override
    public void execute() {
        database.batchWrite(data);
    }
}
