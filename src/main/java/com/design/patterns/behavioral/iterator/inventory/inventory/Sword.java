package com.design.patterns.behavioral.iterator.inventory.inventory;

import lombok.Data;

@Data
public class Sword implements Item {

    @Override
    public String name() {
        return "Sword";
    }
}
