package com.design.patterns.behavioral.strategy.example.route_app.strategy;

public class BicycleRouteStrategy implements RouteStrategy {

    @Override
    public String calculateRoute(String startPoint, String endPoint) {
        return "Calculated route from " + startPoint + " to " + endPoint + " using bicycle.";
    }
}
