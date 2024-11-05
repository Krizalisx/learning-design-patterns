package com.design.patterns.structural.adapter.web;

import com.design.patterns.structural.adapter.web.adapter.XmlToJsonServerAdapter;
import com.design.patterns.structural.adapter.web.client.DataConsumer;
import com.design.patterns.structural.adapter.web.server.JsonDataServer;
import com.design.patterns.structural.adapter.web.server.XmlDataXmlDataServer;

public class Client {

    public static void main(String[] args) {
        DataConsumer dataConsumer = new DataConsumer();

        dataConsumer.consumeJsonData(new JsonDataServer());
        dataConsumer.consumeJsonData(new XmlToJsonServerAdapter(new XmlDataXmlDataServer()));
    }
}
