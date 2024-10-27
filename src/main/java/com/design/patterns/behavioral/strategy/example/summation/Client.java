package com.design.patterns.behavioral.strategy.example.summation;

import com.design.patterns.behavioral.strategy.example.summation.context.ElementsSumApp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        ElementsSumApp elementsSumApp = new ElementsSumApp(Integer::sum);
        log.info("Sum of all elements: {}", elementsSumApp.getSum(List.of(1, 2, 3)));

        elementsSumApp.setISumStrategy((a, b) -> {
            if (a % 2 == 0 && b % 2 == 0) {
                return a + b;
            } else if (a % 2 == 0) {
                return a;
            } else {
                return b;
            }
        });
        log.info("Sum of all even elements: {}", elementsSumApp.getSum(List.of(1, 2, 3)));

        elementsSumApp.setISumStrategy((a, b) -> {
            if (a % 2 != 0 && b % 2 != 0) {
                return a + b;
            } else if (a % 2 != 0) {
                return a;
            } else {
                return b;
            }
        });
        log.info("Sum of all odd elements: {}", elementsSumApp.getSum(List.of(1, 2, 3)));
    }

}
