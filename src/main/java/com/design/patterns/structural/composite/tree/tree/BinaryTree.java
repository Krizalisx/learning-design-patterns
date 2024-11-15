package com.design.patterns.structural.composite.tree.tree;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BinaryTree implements IBinaryTree {

    private final int value;
    private final List<IBinaryTree> children;

    @Override
    public int totalSum() {
        return children.stream().mapToInt(IBinaryTree::totalSum).sum() + value;
    }

    @Override
    public int leafSum() {
        return children.stream().mapToInt(IBinaryTree::leafSum).sum();
    }

    @Override
    public int rootSum() {
        return children.stream().mapToInt(IBinaryTree::rootSum).sum() + value;
    }
}
