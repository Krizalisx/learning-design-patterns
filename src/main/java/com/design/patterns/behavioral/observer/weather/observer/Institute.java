package com.design.patterns.behavioral.observer.weather.observer;

import com.design.patterns.behavioral.observer.weather.observable.WeatherStation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Institute implements IObserver {

    private final WeatherStation weatherStation;

    @Override
    public void update() {
        log.info("Update received: {}", weatherStation.getReport());
    }
}
