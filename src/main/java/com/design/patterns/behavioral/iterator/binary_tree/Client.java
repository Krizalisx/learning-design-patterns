package com.design.patterns.behavioral.iterator.binary_tree;

import com.design.patterns.behavioral.iterator.binary_tree.tree.BinaryTree;
import com.design.patterns.behavioral.iterator.binary_tree.tree.Node;
import java.util.Arrays;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        testTraversal("buildTree", threeLevelUnbalancedTree.iterator(), new int[]{1, 2, 4, 5, 3, 6});
        testTraversal("emptyTree", emptyTree.iterator(), new int[]{});
        testTraversal("singleNodeTree", singleNodeTree.iterator(), new int[]{1});
        testTraversal("twoLevelTree", twoLevelTree.iterator(), new int[]{1, 2, 3});
        testTraversal("threeLevelTree", threeLevelTree.iterator(), new int[]{1, 2, 4, 5, 3, 6, 7});
        testTraversal("unbalancedLeftTree", unbalancedLeftTree.iterator(), new int[]{1, 2, 4, 8, 3});
        testTraversal("unbalancedRightTree", unbalancedRightTree.iterator(), new int[]{1, 2, 3, 6, 9});
        testTraversal("onlyLeftChildTree", onlyLeftChildTree.iterator(), new int[]{1, 2, 4, 8});
        testTraversal("onlyRightChildTree", onlyRightChildTree.iterator(), new int[]{1, 3, 6, 9});

        testTraversal("buildTree", threeLevelUnbalancedTree.inOrderIterator(), new int[]{4, 2, 5, 1, 6, 3});
        testTraversal("emptyTree", emptyTree.inOrderIterator(), new int[]{});
        testTraversal("singleNodeTree", singleNodeTree.inOrderIterator(), new int[]{1});
        testTraversal("twoLevelTree", twoLevelTree.inOrderIterator(), new int[]{2, 1, 3});
        testTraversal("threeLevelTree", threeLevelTree.inOrderIterator(), new int[]{4, 2, 5, 1, 6, 3, 7});
        testTraversal("unbalancedLeftTree", unbalancedLeftTree.inOrderIterator(), new int[]{4, 8, 2, 1, 3});
        testTraversal("unbalancedRightTree", unbalancedRightTree.inOrderIterator(), new int[]{2, 1, 3, 6, 9});
        testTraversal("onlyLeftChildTree", onlyLeftChildTree.inOrderIterator(), new int[]{4, 8, 2, 1});
        testTraversal("onlyRightChildTree", onlyRightChildTree.inOrderIterator(), new int[]{1, 3, 6, 9});
    }

    private static void testTraversal(String name, Iterator<Node> iterator, int[] expectedOrder) {
        log.info("Checking traversal order for tree: {}", name);
        int[] traverse = new int[expectedOrder.length];
        int index = 0;
        while (iterator.hasNext()) {
            Node next = iterator.next();
            log.info("Value: {}", next.getValue());
            traverse[index++] = next.getValue();
        }

        if (!Arrays.equals(traverse, expectedOrder)) {
            throw new RuntimeException("Expected traversal order: " + Arrays.toString(expectedOrder) + " but got: " + Arrays.toString(traverse));
        }

        log.info("");
    }

    //       1
    //     /  \
    //    2    3
    //   / \  /
    //  4  5 6
    //      \
    //       7
    private static BinaryTree threeLevelUnbalancedTree =
        new BinaryTree(
            new Node(1,
                new Node(2,
                    new Node(4, null, null),
                    new Node(5, null, null)),
                new Node(3,
                    new Node(6, null, null),
                    null))
        );

    // Empty tree
    private static BinaryTree emptyTree = new BinaryTree(null);

    // Single node tree
    private static BinaryTree singleNodeTree = new BinaryTree(new Node(1, null, null));


    // Simple tree with two levels
    private static BinaryTree twoLevelTree = new BinaryTree(
        new Node(1,
            new Node(2, null, null),
            new Node(3, null, null)));

    // Tree with three levels
    //      1
    //    /   \
    //   2     3
    //  / \   / \
    // 4   5 6   7
    private static BinaryTree threeLevelTree = new BinaryTree(
        new Node(1,
            new Node(2,
                new Node(4, null, null),
                new Node(5, null, null)),
            new Node(3,
                new Node(6, null, null),
                new Node(7, null, null))));


    // Tree with unbalanced left subtree
    //       1
    //     /  \
    //    2    3
    //   /
    //  4
    //   \
    //    8
    private static BinaryTree unbalancedLeftTree = new BinaryTree(
        new Node(1,
            new Node(2,
                new Node(4,
                    null,
                    new Node(8, null, null)
                ),
                null),
            new Node(3, null, null)
        )
    );


    // Tree with unbalanced right subtree
    //      1
    //    /  \
    //   2    3
    //         \
    //          6
    //           \
    //            9
    private static BinaryTree unbalancedRightTree = new BinaryTree(
        new Node(1,
            new Node(2, null, null),
            new Node(3,
                null,
                new Node(6,
                    null,
                    new Node(9, null, null)))));


    // Tree with only left child
    //       1
    //      /
    //    2
    //   /
    //  4
    //   \
    //    8
    private static BinaryTree onlyLeftChildTree = new BinaryTree(
        new Node(1,
            new Node(2,
                new Node(4,
                    null,
                    new Node(8, null, null)
                ),
                null),
            null));


    // Tree with only right child
    //      1
    //       \
    //        3
    //         \
    //          6
    //           \
    //            9
    private static BinaryTree onlyRightChildTree = new BinaryTree(
        new Node(1,
            null,
            new Node(3,
                null,
                new Node(6,
                    null,
                    new Node(9, null, null)))));
}
