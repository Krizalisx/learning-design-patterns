package com.design.patterns.creational.abstract_factory.cloud.product.aws;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sqs implements Queue {

    @Override
    public String getName() {
        return "SQS";
    }

    @Override
    public void offer(String message) {
        log.info("SQS offered message: {}", message);
    }

    @Override
    public String poll() {
        return "SQS polled message";
    }
}
