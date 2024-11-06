package com.design.patterns.structural.facade.subsystem;

public class BeansSupplier implements IBeansSupplier {

    @Override
    public Bean getBeans(BeansType type) {
        return switch (type) {
            case KENIA -> new Bean(type, 10);
            case COLUMBIA -> new Bean(type, 20);
            case ETHIOPIA -> new Bean(type, 30);
        };
    }
}
