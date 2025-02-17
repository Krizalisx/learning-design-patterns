package com.design.patterns.behavioral.visitor.exporter.shape;

import com.design.patterns.behavioral.visitor.exporter.visitor.ShapeVisitor;

public class Rectangle implements Shape {

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
