package com.design.patterns.behavioral.observer.weather;

import com.design.patterns.behavioral.observer.weather.observable.TemperatureWeatherStation;
import com.design.patterns.behavioral.observer.weather.observable.WeatherStation;
import com.design.patterns.behavioral.observer.weather.observable.WindWeatherStation;
import com.design.patterns.behavioral.observer.weather.observer.Airplane;
import com.design.patterns.behavioral.observer.weather.observer.Institute;

public class Client {

    public static void main(String[] args) {
        WeatherStation temperatureWeatherStation = new TemperatureWeatherStation();
        WindWeatherStation windWeatherStation = new WindWeatherStation();

        Institute institute = new Institute(temperatureWeatherStation);
        Airplane airplane = new Airplane(windWeatherStation);

        temperatureWeatherStation.subscribe(institute);
        windWeatherStation.subscribe(airplane);

        temperatureWeatherStation.generateReport();
        windWeatherStation.generateReport();
    }
}
