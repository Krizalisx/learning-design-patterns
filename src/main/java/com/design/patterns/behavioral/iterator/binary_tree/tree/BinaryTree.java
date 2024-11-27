package com.design.patterns.behavioral.iterator.binary_tree.tree;

import com.design.patterns.behavioral.iterator.binary_tree.iterator.BinaryTreeInOrderIterator;
import com.design.patterns.behavioral.iterator.binary_tree.iterator.BinaryTreePreOrderIterator;
import java.util.Iterator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BinaryTree implements Iterable<Node> {

    private final Node root;

    @Override
    public Iterator<Node> iterator() {
        return new BinaryTreePreOrderIterator(root);
    }

    public Iterator<Node> inOrderIterator() {
        return new BinaryTreeInOrderIterator(root);
    }
}
