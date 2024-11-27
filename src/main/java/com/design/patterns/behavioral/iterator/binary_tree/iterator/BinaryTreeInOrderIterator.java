package com.design.patterns.behavioral.iterator.binary_tree.iterator;

import com.design.patterns.behavioral.iterator.binary_tree.tree.Node;
import java.util.ArrayDeque;
import java.util.Iterator;

public class BinaryTreeInOrderIterator implements Iterator<Node> {

    private final ArrayDeque<Node> stack;

    public BinaryTreeInOrderIterator(Node node) {
        stack = new ArrayDeque<>();
        if (node != null) {
            init(stack, node);
        }
    }

    private void init(ArrayDeque<Node> stack, Node node) {
        stack.addLast(node);
        moveLeft(stack);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node next() {
        if (!stack.isEmpty()) {
            Node curr = stack.peekLast();

            if (curr.getRight() != null) {
                stack.addLast(curr.getRight());
                moveLeft(stack);
                return curr;
            }

            if (stack.size() == 1) {
                return stack.removeLast();
            }

            // determine whether current is left or right child
            Node child = stack.removeLast();
            Node parent = stack.peekLast();
            if (parent.getLeft() != child) {
                while (!stack.isEmpty() && parent.getRight() == child) {
                    child = stack.removeLast();
                    parent = stack.peekLast();
                }
            }

            return curr;
        }

        return null;
    }

    private void moveLeft(ArrayDeque<Node> stack) {
        while (stack.peekLast().getLeft() != null) {
            stack.addLast(stack.peekLast().getLeft());
        }
    }
}
