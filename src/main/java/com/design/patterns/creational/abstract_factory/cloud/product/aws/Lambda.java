package com.design.patterns.creational.abstract_factory.cloud.product.aws;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerlessCompute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lambda implements ServerlessCompute {

    @Override
    public String getName() {
        return "Lambda";
    }

    @Override
    public void compute(String task) {
        log.info("Lambda is computing task: {}", task);
    }
}
