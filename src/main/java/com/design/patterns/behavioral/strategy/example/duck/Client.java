package com.design.patterns.behavioral.strategy.example.duck;

import com.design.patterns.behavioral.strategy.example.duck.context.CloudDuck;
import com.design.patterns.behavioral.strategy.example.duck.context.Duck;
import com.design.patterns.behavioral.strategy.example.duck.context.MountainDuck;
import com.design.patterns.behavioral.strategy.example.duck.strategy.fly.BaseFlyStrategy;
import com.design.patterns.behavioral.strategy.example.duck.strategy.quack.QuackingTypeAStrategy;

public class Client {

    public static void main(String[] args) {
        Duck mountainDuck = new MountainDuck();
        mountainDuck.fly();
        mountainDuck.quack();
        mountainDuck.display();

        CloudDuck cloudDuck = new CloudDuck(new QuackingTypeAStrategy(), new BaseFlyStrategy());
        cloudDuck.fly();
        cloudDuck.quack();
        cloudDuck.display();
    }
}
