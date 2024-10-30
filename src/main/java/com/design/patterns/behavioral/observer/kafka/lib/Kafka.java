package com.design.patterns.behavioral.observer.kafka.lib;

public interface Kafka {

    void subscribe(Consumer consumer, String topic);
    void produce(String topic, String message);

}
