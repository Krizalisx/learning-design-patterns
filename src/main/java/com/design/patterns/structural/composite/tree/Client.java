package com.design.patterns.structural.composite.tree;

import com.design.patterns.structural.composite.tree.tree.BinaryTree;
import com.design.patterns.structural.composite.tree.tree.Leaf;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(1);
        Leaf leaf3 = new Leaf(1);

        BinaryTree subRoot = new BinaryTree(1, List.of(leaf1, leaf2));
        BinaryTree root = new BinaryTree(1, List.of(subRoot, leaf3));

        log.info("Total sum: {}", root.totalSum());
        log.info("Leaf sum: {}", root.leafSum());
        log.info("Root sum: {}", root.rootSum());
    }

}
