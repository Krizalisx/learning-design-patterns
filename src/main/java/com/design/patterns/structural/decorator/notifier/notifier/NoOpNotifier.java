package com.design.patterns.structural.decorator.notifier.notifier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoOpNotifier extends Notifier {

    @Override
    public void send(String message) {
        log.info("NoOp: {}", message);
    }
}
