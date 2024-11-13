package com.design.patterns.behavioral.template_method.record;

import com.design.patterns.behavioral.template_method.record.persistence.Record;
import com.design.patterns.behavioral.template_method.record.persistence.User;

public class Client {

    public static void main(String[] args) {
        Record user = new User("John Doe", "johndoe");

        user.save();
    }

}
