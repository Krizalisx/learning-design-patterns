package com.design.patterns.creational.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EagerSingleton {

    public static EagerSingleton instance = new EagerSingleton();

}
