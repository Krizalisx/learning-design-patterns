package com.design.patterns.structural.flyweight.forest.forest;

import com.design.patterns.structural.flyweight.forest.forest.flyweight.TreeType;
import com.design.patterns.structural.flyweight.forest.forest.flyweight.TreeTypeFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@RequiredArgsConstructor
public class Forest {

    private final List<Tree> trees;
    private final TreeTypeFactory treeTypeFactory;

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = treeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        log.info("Planting new tree: {}.", tree);
        trees.add(tree);
    }

    public void draw() {
        trees.forEach(Tree::draw);
    }
}
