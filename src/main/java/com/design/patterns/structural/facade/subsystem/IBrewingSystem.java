package com.design.patterns.structural.facade.subsystem;

public interface IBrewingSystem {

    Coffee brewCoffee(CoffeeType coffeeType, Bean bean, Water water);

}
