package com.design.patterns.structural.composite.todo.todo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Todo implements ITodo {

    private final String text;

    @Override
    public String getHtml() {
        return text;
    }
}
