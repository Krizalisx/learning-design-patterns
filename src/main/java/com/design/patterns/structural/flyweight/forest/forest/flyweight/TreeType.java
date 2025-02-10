package com.design.patterns.structural.flyweight.forest.forest.flyweight;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TreeType   {

    private final String name;
    private final String color;
    private final String texture;

    public void draw(int x, int y) {
        log.info("Drawing tree at ({}, {}) with type {}", x, y, this);
    }
}
