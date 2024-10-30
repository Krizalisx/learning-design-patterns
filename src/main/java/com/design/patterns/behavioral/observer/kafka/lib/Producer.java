package com.design.patterns.behavioral.observer.kafka.lib;

public abstract class Producer {

    protected abstract void produce(String topic, String message);

    protected abstract String getTopic();

}
