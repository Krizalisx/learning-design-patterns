package com.design.patterns.structural.bridge.code.abstraction;

import com.design.patterns.structural.bridge.code.implementation.Dao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class JavaCode implements Code {

    private final Dao dao;

    @Override
    public void execute() {
        log.info("Executing Java code.");
        dao.save("Result from Java code.");
    }
}
