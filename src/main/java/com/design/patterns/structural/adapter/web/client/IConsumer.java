package com.design.patterns.structural.adapter.web.client;

import com.design.patterns.structural.adapter.web.server.IJsonDataServer;

public interface IConsumer {

    void consumeJsonData(IJsonDataServer server);

}
