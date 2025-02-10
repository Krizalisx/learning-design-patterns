package com.design.patterns.structural.flyweight.forest;

import com.design.patterns.structural.flyweight.forest.forest.Forest;
import com.design.patterns.structural.flyweight.forest.forest.flyweight.TreeTypeFactory;
import java.util.ArrayList;
import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        Forest forest = new Forest(new ArrayList<>(), new TreeTypeFactory(new HashMap<>()));
        forest.plantTree(1, 1, "tree1", "color1", "texture1");
        forest.plantTree(2, 2, "tree2", "color2", "texture2");
        forest.plantTree(3, 3, "tree1", "color1", "texture1");

        forest.draw();
    }
}
