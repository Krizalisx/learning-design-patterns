package com.design.patterns.behavioral.strategy.example.duck.strategy.quack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuackingTypeAStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        log.info("Quacking type A.");
    }
}
