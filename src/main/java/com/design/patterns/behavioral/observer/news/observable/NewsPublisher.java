package com.design.patterns.behavioral.observer.news.observable;

import com.design.patterns.behavioral.observer.news.observer.IObserver;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewsPublisher implements IObservable {

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notification) {
        observers.forEach(iObserver -> iObserver.update("Update for " + iObserver.getClass().getSimpleName() + " " + notification));
    }

    public void produceNews(String news) {
        log.info("Breaking news: {}", news);
        notifyObservers(news);
    }
}
