package com.design.patterns.behavioral.visitor.exporter.shape;

import com.design.patterns.behavioral.visitor.exporter.visitor.ShapeVisitor;

public class Circle implements Shape {

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
