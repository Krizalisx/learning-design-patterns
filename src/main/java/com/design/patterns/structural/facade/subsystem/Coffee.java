package com.design.patterns.structural.facade.subsystem;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Coffee implements ICoffee {

    private final CoffeeType coffeeType;

    @Override
    public void drink() {
        log.info("Drinking coffee: {}", coffeeType);
    }
}
