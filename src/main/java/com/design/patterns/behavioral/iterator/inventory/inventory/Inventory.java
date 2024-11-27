package com.design.patterns.behavioral.iterator.inventory.inventory;

public interface Inventory extends Iterable<Item> {

    int size();

}
