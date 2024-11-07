package com.design.patterns.structural.proxy.parser;

import com.design.patterns.structural.proxy.parser.proxy.LazyBookParserProxy;
import com.design.patterns.structural.proxy.parser.proxy.LazyInConstructorBookParserProxy;
import com.design.patterns.structural.proxy.parser.service.EagerBookParser;
import com.design.patterns.structural.proxy.parser.service.IBookParser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        IBookParser bookParser = new EagerBookParser("Hello world");
        log.info("Calling methods.");
        log.info("Length: {}", bookParser.getLength());
        log.info("Words count: {}", bookParser.getWordsCount());

        bookParser = new LazyBookParserProxy("Hello world");
        log.info("Calling methods.");
        log.info("Length: {}", bookParser.getLength());
        log.info("Words count: {}", bookParser.getWordsCount());

        bookParser = new LazyInConstructorBookParserProxy(() -> new EagerBookParser("Hello world"));
        log.info("Calling methods.");
        log.info("Length: {}", bookParser.getLength());
        log.info("Words count: {}", bookParser.getWordsCount());
    }

}
