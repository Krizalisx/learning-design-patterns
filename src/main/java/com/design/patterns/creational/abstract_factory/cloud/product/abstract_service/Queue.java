package com.design.patterns.creational.abstract_factory.cloud.product.abstract_service;

public interface Queue {

    String getName();

    void offer(String message);

    String poll();
}
