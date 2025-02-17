package com.design.patterns.behavioral.visitor.exporter.shape;

import com.design.patterns.behavioral.visitor.exporter.visitor.ShapeVisitor;

public interface Shape {

    String getName();

    void accept(ShapeVisitor visitor);

}
