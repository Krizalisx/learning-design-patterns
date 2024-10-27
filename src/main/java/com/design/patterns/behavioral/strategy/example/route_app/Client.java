package com.design.patterns.behavioral.strategy.example.route_app;

import com.design.patterns.behavioral.strategy.example.route_app.context.RouteCalculationApp;
import com.design.patterns.behavioral.strategy.example.route_app.strategy.AirplaneRouteStrategy;
import com.design.patterns.behavioral.strategy.example.route_app.strategy.BicycleRouteStrategy;

public class Client {

    public static void main(String[] args) {
        RouteCalculationApp app = new RouteCalculationApp(new AirplaneRouteStrategy());
        app.calculateRoute("Saint-Petersburg", "Amsterdam");

        app.setRouteStrategy(new BicycleRouteStrategy());
        app.calculateRoute("Saint-Petersburg", "Amsterdam");
    }

}
