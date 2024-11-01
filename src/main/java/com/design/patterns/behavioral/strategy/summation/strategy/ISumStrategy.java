package com.design.patterns.behavioral.strategy.example.summation.strategy;

@FunctionalInterface
public interface ISumStrategy {

    Integer sum(Integer a, Integer b);

}
