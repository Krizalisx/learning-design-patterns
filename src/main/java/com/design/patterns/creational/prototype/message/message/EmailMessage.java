package com.design.patterns.creational.prototype.message.message;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmailMessage implements Message {

    private final String subject;
    private final String body;

    private boolean isSent;

    @Override
    public String getMessage() {
        return """
            EmailMessage:
            Subject: %s
            Body: %s
            Is sent: %b
            """
            .formatted(subject, body, isSent);
    }

    @Override
    public EmailMessage getCopy() {
        try {
            return (EmailMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
