package com.design.patterns.behavioral.observer.news.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsSubscriber implements IObserver {

    @Override
    public void update(String message) {
        log.info("Update arrived: {}", message);
    }
}
