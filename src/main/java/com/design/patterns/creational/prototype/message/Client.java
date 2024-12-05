package com.design.patterns.creational.prototype.message;

import com.design.patterns.creational.prototype.message.message.Message;
import com.design.patterns.creational.prototype.message.message.TelegramMessage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Message telegramMessage = new TelegramMessage(1, "Hello");
        Message clone = telegramMessage.getCopy();
        clone.setSent(true);
        log.info("Original message: {}", telegramMessage);
        log.info("Cloned message: {}", clone);
    }

}
