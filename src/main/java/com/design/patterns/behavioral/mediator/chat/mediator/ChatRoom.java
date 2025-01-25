package com.design.patterns.behavioral.mediator.chat.mediator;

import com.design.patterns.behavioral.mediator.chat.colleague.User;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ChatRoom implements ChatMediator {

    private final Set<User> users;

    @Override
    public void send(String message, User user) {
        users.stream()
            .filter(u -> !u.equals(user))
            .forEach(u -> u.receiveMessage(message));
    }

    @Override
    public void addUser(User user) {
        log.info("User added: {}.", user.getName());
        users.add(user);
    }
}
