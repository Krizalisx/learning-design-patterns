package com.design.patterns.creational.prototype.message.message;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TelegramMessage implements Message {

    private final int chatId;
    private final String message;

    private boolean isSent;

    @Override
    public String getMessage() {
        return """
            Telegram message:
            chatId: %s
            message: %s
            isSent: %b
            """
            .formatted(chatId, message, isSent);
    }

    @Override
    public TelegramMessage getCopy() {
        try {
            return (TelegramMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
