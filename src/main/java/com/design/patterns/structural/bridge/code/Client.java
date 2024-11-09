package com.design.patterns.structural.bridge.code;

import com.design.patterns.structural.bridge.code.abstraction.JavaCode;
import com.design.patterns.structural.bridge.code.abstraction.PythonCode;
import com.design.patterns.structural.bridge.code.implementation.Dao;
import com.design.patterns.structural.bridge.code.implementation.MariaDbDao;
import com.design.patterns.structural.bridge.code.implementation.MongoDbDao;

public class Client {

    public static void main(String[] args) {
        Dao mariaDbDao = new MariaDbDao();
        Dao mongoDbDao = new MongoDbDao();

        new JavaCode(mariaDbDao).execute();
        new JavaCode(mongoDbDao).execute();

        new PythonCode(mariaDbDao).execute();
        new PythonCode(mongoDbDao).execute();
    }
}
