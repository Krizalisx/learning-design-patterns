package com.design.patterns.creational.factory_method.example.logistics.creator;

import com.design.patterns.creational.factory_method.example.logistics.Delivery;
import com.design.patterns.creational.factory_method.example.logistics.product.Transport;
import com.design.patterns.creational.factory_method.example.logistics.product.Truck;

public class RoadLogistics implements LogisticsApp {

    @Override
    public void performDelivery(Delivery delivery) {
        createTransport().deliver(delivery);
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
