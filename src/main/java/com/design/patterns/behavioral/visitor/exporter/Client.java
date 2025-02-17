package com.design.patterns.behavioral.visitor.exporter;

import com.design.patterns.behavioral.visitor.exporter.shape.Circle;
import com.design.patterns.behavioral.visitor.exporter.shape.Rectangle;
import com.design.patterns.behavioral.visitor.exporter.shape.Shape;
import com.design.patterns.behavioral.visitor.exporter.visitor.PrintShapeVisitor;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(), new Circle(), new Rectangle());
        PrintShapeVisitor printShapeVisitor = new PrintShapeVisitor();

        shapes.forEach(shape -> shape.accept(printShapeVisitor));
    }
}
