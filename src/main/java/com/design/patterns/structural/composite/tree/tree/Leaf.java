package com.design.patterns.structural.composite.tree.tree;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Leaf implements IBinaryTree {

    private final int value;

    @Override
    public int totalSum() {
        return value;
    }

    @Override
    public int leafSum() {
        return value;
    }

    @Override
    public int rootSum() {
        return 0;
    }
}
