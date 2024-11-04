package com.design.patterns.behavioral.command.database.command;

import com.design.patterns.behavioral.command.database.receiver.IDatabase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveCommand implements ICommand {

    private final IDatabase database;
    private final String data;

    @Override
    public void execute() {
        database.write(data);
    }
}
