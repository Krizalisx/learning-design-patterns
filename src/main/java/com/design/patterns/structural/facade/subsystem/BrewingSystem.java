package com.design.patterns.structural.facade.subsystem;

public class BrewingSystem implements IBrewingSystem {

    @Override
    public Coffee brewCoffee(CoffeeType coffeeType, Bean bean, Water water) {
        return switch (coffeeType) {
            case LATTE -> throw new IllegalArgumentException("Latte is not supported");
            case ESPRESSO -> {
                if (BeansType.KENIA.equals(bean.getName()) && water.getMilliliters() > 300) {
                    yield new Coffee(coffeeType);
                }

                throw new IllegalArgumentException("Not enough ingredients or wrong bean type.");
            }
            case CAPPUCCINO -> new Coffee(coffeeType);
        };
    }
}
