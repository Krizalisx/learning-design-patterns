package com.design.patterns.structural.facade;

import com.design.patterns.structural.facade.subsystem.Bean;
import com.design.patterns.structural.facade.subsystem.BeansSupplier;
import com.design.patterns.structural.facade.subsystem.BeansType;
import com.design.patterns.structural.facade.subsystem.BeansTypeSwitcher;
import com.design.patterns.structural.facade.subsystem.BrewingSystem;
import com.design.patterns.structural.facade.subsystem.Coffee;
import com.design.patterns.structural.facade.subsystem.CoffeeType;
import com.design.patterns.structural.facade.subsystem.IBeansSupplier;
import com.design.patterns.structural.facade.subsystem.IBrewingSystem;
import com.design.patterns.structural.facade.subsystem.Water;

public class CafeFacade implements ICafeFacade {

    private final IBrewingSystem brewingSystem;
    private final IBeansSupplier beansSupplier;
    private final Water water;
    private final BeansTypeSwitcher beansTypeSwitcher;

    public CafeFacade() {
        this.brewingSystem = new BrewingSystem();
        this.beansSupplier = new BeansSupplier();
        this.water = new Water(1000);
        this.beansTypeSwitcher = new BeansTypeSwitcher();
    }

    @Override
    public Coffee orderCoffee(CoffeeType coffeeType) {
        BeansType beansType = beansTypeSwitcher.getBeansType(coffeeType);
        Bean beans = beansSupplier.getBeans(beansType);

        return brewingSystem.brewCoffee(coffeeType, beans, water);
    }
}
