package com.design.patterns.behavioral.memento.text.text;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class TextArea {

    private StringBuilder text;

    public void write(String text) {
        this.text.append(text);
    }

    public String getText() {
        return text.toString();
    }

    public Memento getSnapshot() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getText());
    }

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Memento {

        @Getter(AccessLevel.PRIVATE)
        private final String text;

    }
}
