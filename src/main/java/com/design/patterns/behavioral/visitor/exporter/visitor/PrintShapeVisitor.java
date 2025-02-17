package com.design.patterns.behavioral.visitor.exporter.visitor;

import com.design.patterns.behavioral.visitor.exporter.shape.Circle;
import com.design.patterns.behavioral.visitor.exporter.shape.Rectangle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintShapeVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        log.info("Circle: {}", circle.getName());
    }

    @Override
    public void visit(Rectangle rectangle) {
        log.info("Rectangle: {}", rectangle.getName());
    }
}
