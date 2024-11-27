package com.design.patterns.behavioral.iterator.inventory.inventory;

import lombok.Data;

@Data
public class Shield implements Item {

    @Override
    public String name() {
        return "Shield";
    }
}
