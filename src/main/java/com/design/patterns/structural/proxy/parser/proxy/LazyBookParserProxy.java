package com.design.patterns.structural.proxy.parser.proxy;

import com.design.patterns.structural.proxy.parser.service.EagerBookParser;
import com.design.patterns.structural.proxy.parser.service.IBookParser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LazyBookParserProxy implements IBookParser {

    private final String text;
    private IBookParser bookParser;

    @Override
    public int getLength() {
        initIfNull();
        return this.bookParser.getLength();
    }

    @Override
    public int getWordsCount() {
        initIfNull();
        return this.bookParser.getWordsCount();
    }

    private void initIfNull() {
        if (bookParser == null) {
            bookParser = new EagerBookParser(text);
        }
    }
}
