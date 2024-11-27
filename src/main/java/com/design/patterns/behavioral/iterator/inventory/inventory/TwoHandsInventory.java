package com.design.patterns.behavioral.iterator.inventory.inventory;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwoHandsInventory implements Inventory {

    private Item lhs;
    private Item rhs;

    @Override
    public int size() {
        return 2;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Item> {

        private int currIndex = 0;

        @Override
        public boolean hasNext() {
            return currIndex < 2;
        }

        @Override
        public Item next() {
            return switch (currIndex++) {
                case 0 -> lhs;
                case 1 -> rhs;
                default -> throw new NoSuchElementException();
            };
        }
    }

}
