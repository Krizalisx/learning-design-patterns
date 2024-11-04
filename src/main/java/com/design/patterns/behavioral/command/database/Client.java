package com.design.patterns.behavioral.command.database;

import com.design.patterns.behavioral.command.database.invoker.BufferPersistenceFramework;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        BufferPersistenceFramework persistenceFramework = new BufferPersistenceFramework();

        persistenceFramework.save("Let's learn Command patter.");
        persistenceFramework.save("It allows us to put commands in queues.");
        persistenceFramework.save("This way we can implement buffer.");
        persistenceFramework.save("Or a lot of different things.");

        persistenceFramework.batchSave(List.of("Strategy", "Observer", "Command"));
    }
}
