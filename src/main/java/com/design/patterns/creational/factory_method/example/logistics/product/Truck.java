package com.design.patterns.creational.factory_method.example.logistics.product;

import com.design.patterns.creational.factory_method.example.logistics.Delivery;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Truck implements Transport {

    @Override
    public void deliver(Delivery delivery) {
        log.info("{} delivered by truck.", delivery.getProductName());
    }
}
