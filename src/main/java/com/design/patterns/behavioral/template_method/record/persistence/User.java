package com.design.patterns.behavioral.template_method.record.persistence;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class User extends Record {

    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    void beforeSave() {
        log.info("User. Before saving record.");
    }

    @Override
    void afterSave() {
        log.info("User. After saving record.");
    }
}
