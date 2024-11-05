package com.design.patterns.structural.adapter.web.server;

public class JsonDataServer implements IJsonDataServer {

    @Override
    public String getJsonData() {
        return "Json data";
    }
}
