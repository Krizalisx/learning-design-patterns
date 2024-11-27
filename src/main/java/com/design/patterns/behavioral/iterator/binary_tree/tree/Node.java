package com.design.patterns.behavioral.iterator.binary_tree.tree;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Node {

    private final int value;
    private final Node left;
    private final Node right;

}
