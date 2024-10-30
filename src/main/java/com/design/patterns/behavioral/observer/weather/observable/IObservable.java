package com.design.patterns.behavioral.observer.weather.observable;

import com.design.patterns.behavioral.observer.weather.observer.IObserver;

public interface IObservable {

    void subscribe(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers();

}
