package com.design.patterns.structural.facade.subsystem;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Bean {

    private final BeansType name;
    private final int weight;

}
