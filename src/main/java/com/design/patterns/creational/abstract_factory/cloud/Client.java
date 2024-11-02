package com.design.patterns.creational.abstract_factory.cloud;

import com.design.patterns.creational.abstract_factory.cloud.creator.AbstractCloudServiceFactory;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        AbstractFactoryApplication.initialize("AWS");
        AbstractCloudServiceFactory cloudServiceFactory = AbstractFactoryApplication.getCloudServiceFactory();

        cloudServiceFactory.createServerlessCompute().compute("Task 1");
        ServerCompute serverCompute = cloudServiceFactory.createServerCompute();
        serverCompute.compute("Task 2");
        serverCompute.compute("Task 3");



        AbstractFactoryApplication.initialize("Azure");
        AbstractCloudServiceFactory cloudServiceFactory1 = AbstractFactoryApplication.getCloudServiceFactory();
        cloudServiceFactory1.createServerlessCompute().compute("Task 4");
        Queue queue = cloudServiceFactory1.createQueue();
        queue.offer("Task 5");
        log.info(queue.poll());
    }
}
