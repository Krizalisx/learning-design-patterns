package com.design.patterns.structural.decorator.notifier.decorator;

import com.design.patterns.structural.decorator.notifier.notifier.Notifier;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class BaseNotifierDecorator extends Notifier {

    private final Notifier notifier;

    @Override
    public void send(String message) {
        notifier.send(message);
    }

}
