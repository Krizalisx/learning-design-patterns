package com.design.patterns.behavioral.strategy.example.duck.context;

import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.IFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.IQuackStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WildDuck extends Duck {

    public WildDuck(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        super(iQuackStrategy, iFlyStrategy);
    }

    public WildDuck() {
        super();
    }

    @Override
    public void display() {
        log.info("Displaying wild duck.");
    }
}
