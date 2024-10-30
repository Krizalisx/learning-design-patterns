package com.design.patterns.behavioral.observer.kafka;

import com.design.patterns.behavioral.observer.kafka.lib.KafkaPushModel;
import com.design.patterns.behavioral.observer.kafka.observable.StockExchange;
import com.design.patterns.behavioral.observer.kafka.observer.Hamster;
import com.design.patterns.behavioral.observer.kafka.observer.Trader;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        KafkaPushModel kafkaPushModel = new KafkaPushModel();
        StockExchange stockExchange = new StockExchange(kafkaPushModel);
        kafkaPushModel.subscribe(new Trader(), stockExchange.getTopic());
        kafkaPushModel.subscribe(new Hamster(), stockExchange.getTopic());

        String aapl = stockExchange.getInfoAboutStock("AAPL");
        log.info("Got info from main class: {}", aapl);
    }
}
