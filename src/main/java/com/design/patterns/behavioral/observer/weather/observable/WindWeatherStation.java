package com.design.patterns.behavioral.observer.weather.observable;

public class WindWeatherStation extends WeatherStation {

    @Override
    public String getReport() {
        return "Report from WindWeatherStation";
    }

    @Override
    public void generateReport() {
        notifyObservers();
    }

    public String getWind() {
        return "Wind from WindWeatherStation";
    }
}
