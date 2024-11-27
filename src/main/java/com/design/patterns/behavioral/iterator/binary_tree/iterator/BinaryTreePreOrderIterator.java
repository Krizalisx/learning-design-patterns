package com.design.patterns.behavioral.iterator.binary_tree.iterator;

import com.design.patterns.behavioral.iterator.binary_tree.tree.Node;
import java.util.ArrayDeque;
import java.util.Iterator;

public class BinaryTreePreOrderIterator implements Iterator<Node> {

    private final ArrayDeque<Node> stack;

    public BinaryTreePreOrderIterator(Node node) {
        stack = new ArrayDeque<>();
        if (node != null) {
            stack.addLast(node);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node next() {
        if (!stack.isEmpty()) {
            Node curr = stack.peekLast();
            if (curr.getLeft() != null) {
                stack.addLast(curr.getLeft());
                return curr;
            }

            if (curr.getRight() != null) {
                stack.addLast(curr.getRight());
                return curr;
            }

            if (stack.size() == 1) {
                return stack.removeLast();
            }

            Node child = stack.removeLast();
            while (!stack.isEmpty() && (stack.peekLast().getRight() == null || stack.peekLast().getRight() == child)) {
                child = stack.removeLast();
            }

            if (stack.isEmpty()) {
                return curr;
            }

            stack.addLast(stack.peekLast().getRight());

            return curr;
        }

        return null;
    }
}
