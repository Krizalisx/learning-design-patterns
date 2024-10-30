package com.design.patterns.behavioral.observer.kafka.observer;

import com.design.patterns.behavioral.observer.kafka.lib.Consumer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Trader implements Consumer {

    @Override
    public void consume(String message) {
        log.info("Trader received: {}", message);
    }
}
