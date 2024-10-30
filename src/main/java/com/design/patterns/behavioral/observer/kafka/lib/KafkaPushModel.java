package com.design.patterns.behavioral.observer.kafka.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaPushModel implements Kafka {

    Map<String, List<Consumer>> topicsConsumersMap = new HashMap<>();

    @Override
    public void subscribe(Consumer consumer, String topic) {
        topicsConsumersMap.computeIfAbsent(topic, key -> new ArrayList<>()).add(consumer);
    }

    @Override
    public void produce(String topic, String message) {
        topicsConsumersMap.getOrDefault(topic, new ArrayList<>()).forEach(consumer -> consumer.consume(message));
    }
}
