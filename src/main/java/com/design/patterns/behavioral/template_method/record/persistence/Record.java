package com.design.patterns.behavioral.template_method.record.persistence;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Record {

    protected PersistenceFramework persistenceFramework;

    public Record() {
        this.persistenceFramework = new PersistenceFrameworkImpl();
    }

    abstract void beforeSave();

    abstract void afterSave();

    public final void save() {
        beforeSave();
        persistenceFramework.save(this);
        afterSave();
    }

}
