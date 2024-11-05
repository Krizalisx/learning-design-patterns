package com.design.patterns.structural.adapter.web.server;

public class XmlDataXmlDataServer implements IXmlDataServer {

    @Override
    public String getDataInXmlFormat() {
        return "Xml data";
    }
}
