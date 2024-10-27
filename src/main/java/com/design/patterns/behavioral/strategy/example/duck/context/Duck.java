package com.design.patterns.behavioral.strategy.example.duck.context;

import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.BaseFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.IFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.BaseQuackingStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.IQuackStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public abstract class Duck {

    private final IQuackStrategy iQuackStrategy;
    private final IFlyStrategy iFlyStrategy;

    protected Duck() {
        this.iQuackStrategy = new BaseQuackingStrategy();
        this.iFlyStrategy = new BaseFlyStrategy();
    }

    public abstract void display();

    public void quack() {
        iQuackStrategy.quack();
    }

    public void fly() {
        iFlyStrategy.fly();
    }

}
