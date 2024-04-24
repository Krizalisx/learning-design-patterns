package com.design.patterns.creational.factory_method.example.logistics.creator;

import com.design.patterns.creational.factory_method.example.logistics.Delivery;
import com.design.patterns.creational.factory_method.example.logistics.product.Transport;

public interface LogisticsApp {

    void performDelivery(Delivery delivery);

    Transport createTransport();

}
