package com.design.patterns.creational.abstract_factory.cloud.product.aws;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ec2 implements ServerCompute {

    @Override
    public String getName() {
        return "EC2";
    }

    @Override
    public void compute(String task) {
        log.info("EC2 is computing task: {}", task);
    }
}
