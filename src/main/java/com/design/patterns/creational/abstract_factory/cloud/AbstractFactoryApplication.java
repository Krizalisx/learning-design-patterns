package com.design.patterns.creational.abstract_factory.cloud;

import com.design.patterns.creational.abstract_factory.cloud.creator.AbstractCloudServiceFactory;
import com.design.patterns.creational.abstract_factory.cloud.creator.AwsCloudServiceFactory;
import com.design.patterns.creational.abstract_factory.cloud.creator.AzureCloudServiceFactory;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractFactoryApplication {

    @Getter
    private static AbstractCloudServiceFactory cloudServiceFactory;

    public static void initialize(String cloudProvider) {
        log.info("Initializing cloud provider: {}", cloudProvider);
        if ("AWS".equalsIgnoreCase(cloudProvider)) {
            cloudServiceFactory = new AwsCloudServiceFactory();
        } else if ("Azure".equalsIgnoreCase(cloudProvider)) {
            cloudServiceFactory = new AzureCloudServiceFactory();
        } else {
            throw new IllegalArgumentException("Unknown cloud provider: " + cloudProvider);
        }
    }
}
