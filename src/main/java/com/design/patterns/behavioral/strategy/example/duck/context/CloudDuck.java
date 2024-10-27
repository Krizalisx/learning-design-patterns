package com.design.patterns.behavioral.strategy.example.duck.context;

import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.IFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.IQuackStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CloudDuck extends Duck {

    public CloudDuck(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        super(iQuackStrategy, iFlyStrategy);
    }

    public CloudDuck() {
        super();
    }

    @Override
    public void display() {
        log.info("Displaying CloudDuck.");
    }
}
