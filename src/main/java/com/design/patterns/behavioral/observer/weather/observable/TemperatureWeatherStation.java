package com.design.patterns.behavioral.observer.weather.observable;

public class TemperatureWeatherStation extends WeatherStation {

    @Override
    public String getReport() {
        return "Report from TemperatureWeatherStation";
    }

    @Override
    public void generateReport() {
        notifyObservers();
    }

    public String getTemperature() {
        return "Temperature from TemperatureWeatherStation";
    }
}
