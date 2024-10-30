package com.design.patterns.behavioral.observer.weather.observable;

import com.design.patterns.behavioral.observer.weather.observer.IObserver;
import java.util.ArrayList;
import java.util.List;

public abstract class WeatherStation implements IObservable {

    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public abstract String getReport();

    public abstract void generateReport();
}
