package com.design.patterns.creational.abstract_factory.cloud.creator;

import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.Queue;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.abstract_service.ServerlessCompute;
import com.design.patterns.creational.abstract_factory.cloud.product.aws.Ec2;
import com.design.patterns.creational.abstract_factory.cloud.product.aws.Lambda;
import com.design.patterns.creational.abstract_factory.cloud.product.aws.Sqs;

public class AwsCloudServiceFactory implements AbstractCloudServiceFactory {

    @Override
    public ServerCompute createServerCompute() {
        return new Ec2();
    }

    @Override
    public ServerlessCompute createServerlessCompute() {
        return new Lambda();
    }

    @Override
    public Queue createQueue() {
        return new Sqs();
    }
}
