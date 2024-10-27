package com.design.patterns.behavioral.strategy.example.duck.context;

import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.IFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.IQuackStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CityDuck extends Duck {

    public CityDuck(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        super(iQuackStrategy, iFlyStrategy);
    }

    public CityDuck() {
        super();
    }

    @Override
    public void display() {
        log.info("Displaying City Duck.");
    }
}
