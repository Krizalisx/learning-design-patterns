package com.design.patterns.creational.abstract_factory.cloud.creator;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerlessCompute;

public interface AbstractCloudServiceFactory {

    ServerCompute createServerCompute();

    ServerlessCompute createServerlessCompute();

    Queue createQueue();

}
