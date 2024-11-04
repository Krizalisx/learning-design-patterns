package com.design.patterns.behavioral.command.database.receiver;

import java.util.List;

public interface IDatabase {

    void write(String data);

    void batchWrite(List<String> data);

}
