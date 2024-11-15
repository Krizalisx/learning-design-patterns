package com.design.patterns.structural.composite.todo.todo;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CompositeTodoProject implements ITodo {

    private final String projectName;
    private final List<ITodo> todos;

    @Override
    public String getHtml() {
        StringBuilder result = new StringBuilder();
        result.append("<h1>").append(projectName).append("</h1>");
        result.append("<ul>");
        for (ITodo todo : todos) {
            result.append("<li>").append(todo.getHtml()).append("</li>");
        }
        result.append("</ul>");

        return result.toString();
    }
}
