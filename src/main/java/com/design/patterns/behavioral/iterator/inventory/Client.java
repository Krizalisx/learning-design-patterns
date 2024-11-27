package com.design.patterns.behavioral.iterator.inventory;

import com.design.patterns.behavioral.iterator.inventory.inventory.Inventory;
import com.design.patterns.behavioral.iterator.inventory.inventory.Item;
import com.design.patterns.behavioral.iterator.inventory.inventory.Shield;
import com.design.patterns.behavioral.iterator.inventory.inventory.Sword;
import com.design.patterns.behavioral.iterator.inventory.inventory.TwoHandsInventory;
import java.util.Iterator;
import java.util.NoSuchElementException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Inventory inventory = new TwoHandsInventory(new Shield(), new Sword());
        Iterator<Item> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            log.info("Item: {}", item);
        }

        try {
            iterator.next();
        } catch (NoSuchElementException e) {
            log.info("No more items");
        }
    }
}
