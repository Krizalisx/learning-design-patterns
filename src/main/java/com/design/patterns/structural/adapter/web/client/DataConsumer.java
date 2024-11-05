package com.design.patterns.structural.adapter.web.client;

import com.design.patterns.structural.adapter.web.server.IJsonDataServer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataConsumer implements IConsumer {

    @Override
    public void consumeJsonData(IJsonDataServer server) {
        log.info("Consuming json data from server: {}", server.getJsonData());
    }
}
