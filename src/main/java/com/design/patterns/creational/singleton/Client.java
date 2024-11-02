package com.design.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        log.info("Eager Singleton: {}", EagerSingleton.instance);
        log.info("Eager Singleton: {}", EagerSingleton.instance);

        log.info("Lazy Singleton: {}", LazySingleton.getInstance());
        log.info("Lazy Singleton: {}", LazySingleton.getInstance());
    }

}
