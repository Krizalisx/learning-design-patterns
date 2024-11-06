package com.design.patterns.structural.facade;

import com.design.patterns.structural.facade.subsystem.Coffee;
import com.design.patterns.structural.facade.subsystem.CoffeeType;

public interface ICafeFacade {

    Coffee orderCoffee(CoffeeType coffeeType);

}
