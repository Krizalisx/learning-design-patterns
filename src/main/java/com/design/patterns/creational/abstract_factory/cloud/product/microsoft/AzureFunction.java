package com.design.patterns.creational.abstract_factory.cloud.product.microsoft;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerlessCompute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AzureFunction implements ServerlessCompute {

    @Override
    public String getName() {
        return "Azure Function";
    }

    @Override
    public void compute(String task) {
        log.error("Azure Functions is computing task: {}", task);
    }
}
