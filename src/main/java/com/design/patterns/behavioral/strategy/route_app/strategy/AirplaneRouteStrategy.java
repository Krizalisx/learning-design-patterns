package com.design.patterns.behavioral.strategy.example.route_app.strategy;

public class AirplaneRouteStrategy implements RouteStrategy {

    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        return "Calculated route from " + startPoint + " to " + endPoint + " by airplane.";
    }
}
