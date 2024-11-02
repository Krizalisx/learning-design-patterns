package com.design.patterns.creational.abstract_factory.cloud.creator;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerlessCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.microsoft.Asq;
import com.design.patterns.creational.abstract_factory.cloud.product.microsoft.AzureCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.microsoft.AzureFunction;

public class AzureCloudServiceFactory implements AbstractCloudServiceFactory{

    @Override
    public ServerCompute createServerCompute() {
        return new AzureCompute();
    }

    @Override
    public ServerlessCompute createServerlessCompute() {
        return new AzureFunction();
    }

    @Override
    public Queue createQueue() {
        return new Asq();
    }
}
