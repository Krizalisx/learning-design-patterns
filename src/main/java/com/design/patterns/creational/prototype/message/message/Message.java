package com.design.patterns.creational.prototype.message.message;

public interface Message extends Cloneable {

    String getMessage();

    boolean isSent();

    void setSent(boolean isSent);

    Message getCopy();
}
