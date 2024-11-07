package com.design.patterns.structural.proxy.parser.service;

import java.time.Duration;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EagerBookParser implements IBookParser {

    private final String text;

    private final int length;

    private final int wordsCount;

    @SneakyThrows
    public EagerBookParser(String text) {
        log.info("Initializing EagerBookParser. Costly operation.");
        Thread.sleep(Duration.ofSeconds(1));
        log.info("EagerBookParser initialized.");

        this.text = text;
        this.length = text.length();
        this.wordsCount = calculateWordsCount(text);
    }

    private int calculateWordsCount(String text) {
        return text.split(" ").length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWordsCount() {
        return wordsCount;
    }
}
