package com.design.patterns.creational.factory_method.example.logistics;

import com.design.patterns.creational.factory_method.example.logistics.creator.RoadLogistics;
import com.design.patterns.creational.factory_method.example.logistics.creator.WaterLogistics;

public class Client {

    public static void main(String[] args) {
        Delivery delivery = new Delivery("Smartphone");
        new RoadLogistics().performDelivery(delivery);
        new WaterLogistics().performDelivery(delivery);
    }
}
