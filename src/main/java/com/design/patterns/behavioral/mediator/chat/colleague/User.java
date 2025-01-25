package com.design.patterns.behavioral.mediator.chat.colleague;

public interface User {

    String getName();

    void sendMessage(String message);

    void receiveMessage(String message);

}
