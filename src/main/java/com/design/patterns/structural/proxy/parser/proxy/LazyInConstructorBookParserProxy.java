package com.design.patterns.structural.proxy.parser.proxy;


import com.design.patterns.structural.proxy.parser.service.IBookParser;
import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LazyInConstructorBookParserProxy implements IBookParser {

    private final Supplier<IBookParser> bookParserConsumer;
    private IBookParser bookParser;

    @Override
    public int getLength() {
        initIfNull();
        return bookParser.getLength();
    }

    @Override
    public int getWordsCount() {
        initIfNull();
        return bookParser.getWordsCount();
    }

    private void initIfNull() {
        if (bookParser == null) {
            bookParser = bookParserConsumer.get();
        }
    }
}
