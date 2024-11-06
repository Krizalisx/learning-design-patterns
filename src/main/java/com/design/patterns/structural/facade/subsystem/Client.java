package com.design.patterns.structural.facade.subsystem;

import com.design.patterns.structural.facade.CafeFacade;

public class Client {

    public static void main(String[] args) {
        CafeFacade cafeFacade = new CafeFacade();
        Coffee coffee = cafeFacade.orderCoffee(CoffeeType.ESPRESSO);
        coffee.drink();

        Coffee coffee1 = cafeFacade.orderCoffee(CoffeeType.CAPPUCCINO);
        coffee1.drink();
    }

}
