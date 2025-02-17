package com.design.patterns.behavioral.visitor.exporter.visitor;

import com.design.patterns.behavioral.visitor.exporter.shape.Circle;
import com.design.patterns.behavioral.visitor.exporter.shape.Rectangle;

public interface ShapeVisitor {

    void visit(Circle circle);

    void visit(Rectangle rectangle);

}
