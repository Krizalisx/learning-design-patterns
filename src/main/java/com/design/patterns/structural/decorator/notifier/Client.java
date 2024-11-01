package com.design.patterns.structural.decorator.notifier;

import com.design.patterns.structural.decorator.notifier.decorator.FacebookNotifierDecorator;
import com.design.patterns.structural.decorator.notifier.decorator.SmsNotifierDecorator;
import com.design.patterns.structural.decorator.notifier.notifier.NoOpNotifier;
import com.design.patterns.structural.decorator.notifier.notifier.Notifier;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier.send("Let's learn the Decorator pattern.");

        Notifier notificationStack = new SmsNotifierDecorator(new FacebookNotifierDecorator(notifier));
        notificationStack.send("Well, very smart but a bit clumsy.");

        Notifier notificationStack2 = new SmsNotifierDecorator(new FacebookNotifierDecorator(new NoOpNotifier()));
        notificationStack2.send("Even more clumsy.");
    }

}
