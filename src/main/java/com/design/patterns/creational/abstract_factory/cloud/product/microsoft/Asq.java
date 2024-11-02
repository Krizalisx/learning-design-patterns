package com.design.patterns.creational.abstract_factory.cloud.product.microsoft;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Asq implements Queue {

    @Override
    public String getName() {
        return "ASQ";
    }

    @Override
    public void offer(String message) {
        log.info("ASQ offered message: {}", message);
    }

    @Override
    public String poll() {
        return "ASQ polled message";
    }
}
