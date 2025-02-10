package com.design.patterns.structural.flyweight.forest.forest.flyweight;

import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TreeTypeFactory {

    private final Map<String, TreeType> treeTypesCache;

    public TreeType getTreeType(String name, String color, String texture) {
        return treeTypesCache.computeIfAbsent("%s%s%s".formatted(name, color, texture), key -> new TreeType(name, color, texture));
    }
}
