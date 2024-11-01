package com.design.patterns.structural.decorator.notifier.decorator;

import com.design.patterns.structural.decorator.notifier.notifier.Notifier;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsNotifierDecorator extends BaseNotifierDecorator {

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        log.info("Sending SMS: {}", message);
    }
}
