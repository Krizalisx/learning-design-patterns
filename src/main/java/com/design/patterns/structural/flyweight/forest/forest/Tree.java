package com.design.patterns.structural.flyweight.forest.forest;

import com.design.patterns.structural.flyweight.forest.forest.flyweight.TreeType;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Tree {

    private int x;
    private int y;
    private TreeType treeType;

    public void draw() {
        treeType.draw(x, y);
    }
}
