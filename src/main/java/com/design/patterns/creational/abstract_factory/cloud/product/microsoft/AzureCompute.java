package com.design.patterns.creational.abstract_factory.cloud.product.microsoft;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AzureCompute implements ServerCompute {

    @Override
    public String getName() {
        return "Azure Compute";
    }

    @Override
    public void compute(String task) {
        log.info("Azure Compute is computing task: {}", task);
    }
}
