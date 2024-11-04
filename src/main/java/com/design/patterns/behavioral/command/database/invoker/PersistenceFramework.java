package com.design.patterns.behavioral.command.database.invoker;

import java.util.List;

public interface PersistenceFramework {

    void save(String data);

    void batchSave(List<String> data);

}
