package com.design.patterns.structural.facade.subsystem;

public class BeansTypeSwitcher {

    public BeansType getBeansType(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> BeansType.KENIA;
            case LATTE -> BeansType.ETHIOPIA;
            case CAPPUCCINO -> BeansType.COLUMBIA;
        };
    }

}
