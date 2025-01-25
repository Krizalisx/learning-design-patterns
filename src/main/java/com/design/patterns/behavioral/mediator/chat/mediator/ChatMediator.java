package com.design.patterns.behavioral.mediator.chat.mediator;

import com.design.patterns.behavioral.mediator.chat.colleague.User;

public interface ChatMediator {

    void send(String message, User user);

    void addUser(User user);

}
