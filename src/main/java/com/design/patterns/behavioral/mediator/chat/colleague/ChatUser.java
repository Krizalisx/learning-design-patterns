package com.design.patterns.behavioral.mediator.chat.colleague;

import com.design.patterns.behavioral.mediator.chat.mediator.ChatMediator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ChatUser implements User {

    private final ChatMediator mediator;

    @Getter
    private final String name;

    @Override
    public void sendMessage(String message) {
        log.info("Message sent: {} by {}.", message, name);
        mediator.send(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        log.info("Message received: {} by {}.", message, name);
    }
}
