package com.design.patterns.behavioral.strategy.example.duck.context;

import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.IFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.IQuackStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MountainDuck extends Duck {

    public MountainDuck(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        super(iQuackStrategy, iFlyStrategy);
    }

    public MountainDuck() {
        super();
    }

    @Override
    public void display() {
        log.info("Displaying MountainDuck.");
    }
}
