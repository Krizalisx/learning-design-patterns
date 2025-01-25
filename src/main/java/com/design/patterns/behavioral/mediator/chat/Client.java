package com.design.patterns.behavioral.mediator.chat;

import com.design.patterns.behavioral.mediator.chat.colleague.ChatUser;
import com.design.patterns.behavioral.mediator.chat.mediator.ChatRoom;
import java.util.HashSet;

public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom(new HashSet<>());
        ChatUser john = new ChatUser(chatRoom, "John");
        ChatUser jane = new ChatUser(chatRoom, "Jane");

        chatRoom.addUser(john);
        john.sendMessage("Hi Jane!");

        chatRoom.addUser(jane);

        john.sendMessage("Hi Jane!");
        jane.sendMessage("Hi John!");
    }
}
