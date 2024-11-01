package com.design.patterns.behavioral.strategy.example.route_app.context;

import com.design.patterns.behavioral.strategy.example.route_app.strategy.RouteStrategy;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@AllArgsConstructor
public class RouteCalculationApp {

    private RouteStrategy routeStrategy;

    public void calculateRoute(String startPoint, String endPoint) {
        log.info("Calculating route from {} to {}.", startPoint, endPoint);
        String route = routeStrategy.calculateRoute(startPoint, endPoint);

        displayRoute(route);

    }

    private void displayRoute(String calculatedRoute) {
        log.info("Route calculated: {}", calculatedRoute);
    }
}
