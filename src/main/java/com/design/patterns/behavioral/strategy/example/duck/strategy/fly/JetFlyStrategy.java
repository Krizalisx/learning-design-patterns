package com.design.patterns.behavioral.strategy.example.duck.strategy.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JetFlyStrategy implements IFlyStrategy {

    @Override
    public void fly() {
        log.info("Jet fly.");
    }
}
