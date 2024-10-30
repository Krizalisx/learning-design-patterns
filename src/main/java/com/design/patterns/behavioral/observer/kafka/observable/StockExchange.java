package com.design.patterns.behavioral.observer.kafka.observable;

import com.design.patterns.behavioral.observer.kafka.lib.Kafka;
import com.design.patterns.behavioral.observer.kafka.lib.Producer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class StockExchange extends Producer {

    private final Kafka kafka;

    @Override
    protected void produce(String topic, String message) {
        kafka.produce(topic, message);
    }

    @Override
    public String getTopic() {
        return "StockExchangeTopic";
    }

    public String getInfoAboutStock(String stock) {
        String stockInfo = "Stock's " + stock + " price is " + Math.random();
        produce(getTopic(), stockInfo);

        return stockInfo;
    }
}
