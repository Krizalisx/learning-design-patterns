package com.design.patterns.creational.factory_method.example.logistics.creator;

import com.design.patterns.creational.factory_method.example.logistics.Delivery;
import com.design.patterns.creational.factory_method.example.logistics.product.Ship;
import com.design.patterns.creational.factory_method.example.logistics.product.Transport;

public class WaterLogistics implements LogisticsApp {

    @Override
    public void performDelivery(Delivery delivery) {
        createTransport().deliver(delivery);
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
