package com.design.patterns.structural.adapter.web.adapter;

import com.design.patterns.structural.adapter.web.server.IJsonDataServer;
import com.design.patterns.structural.adapter.web.server.IXmlDataServer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class XmlToJsonServerAdapter implements IJsonDataServer {

    private final IXmlDataServer xmlDataServer;

    @Override
    public String getJsonData() {
        String dataInXmlFormat = xmlDataServer.getDataInXmlFormat();
        log.info("Converting XML to JSON: {}", dataInXmlFormat);
        return "Converted XML to JSON data";
    }
}
