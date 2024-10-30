package com.design.patterns.behavioral.observer.news.observable;

import com.design.patterns.behavioral.observer.news.observer.IObserver;

public interface IObservable {

    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String notification);

}
