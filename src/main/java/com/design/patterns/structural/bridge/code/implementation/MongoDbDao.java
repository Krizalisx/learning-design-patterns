package com.design.patterns.structural.bridge.code.implementation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoDbDao implements Dao {

    @Override
    public void save(String data) {
        log.info("Saving data to MongoDb: {}", data);
    }
}
