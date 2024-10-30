package com.design.patterns.behavioral.observer.weather.observer;

import com.design.patterns.behavioral.observer.weather.observable.WindWeatherStation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Airplane implements IObserver {

    private final WindWeatherStation windWeatherStation;

    @Override
    public void update() {
        log.info("Update received: {}", windWeatherStation.getWind());
    }
}
