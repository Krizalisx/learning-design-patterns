package com.design.patterns.behavioral.observer.kafka.observer;

import com.design.patterns.behavioral.observer.kafka.lib.Consumer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hamster implements Consumer {

    @Override
    public void consume(String message) {
        log.info("Hamster received: {}", message);
    }
}
