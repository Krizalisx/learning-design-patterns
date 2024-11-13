package com.design.patterns.behavioral.template_method.record.persistence;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersistenceFrameworkImpl implements PersistenceFramework {

    @Override
    public void save(Record record) {
        log.info("Saving record: {}", record);
    }
}
