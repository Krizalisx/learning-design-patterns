package com.design.patterns.behavioral.command.database.receiver;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Database implements IDatabase {

    @Override
    public void write(String data) {
        log.info("Saving data to db: {}", data);
    }

    @Override
    public void batchWrite(List<String> data) {
        log.info("Saving data to db in batch: {}", data);
    }
}
