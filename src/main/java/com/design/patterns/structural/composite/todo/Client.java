package com.design.patterns.structural.composite.todo;

import com.design.patterns.structural.composite.todo.todo.CompositeTodoProject;
import com.design.patterns.structural.composite.todo.todo.ITodo;
import com.design.patterns.structural.composite.todo.todo.Todo;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Todo learnCompositePattern = new Todo("Learn Composite pattern");
        Todo learnStrategyPattern = new Todo("Learn Strategy pattern");
        Todo learnDecoratorPattern = new Todo("Learn Decorator pattern");

        Todo buyMilk = new Todo("Buy milk");
        Todo buyBread = new Todo("Buy bread");
        Todo buyCheese = new Todo("Buy cheese");

        ITodo groceriesProject = new CompositeTodoProject("Groceries", List.of(buyMilk, buyBread, buyCheese));

        CompositeTodoProject designPatternsProject = new CompositeTodoProject("Design patterns", List.of(learnCompositePattern, learnStrategyPattern, learnDecoratorPattern, groceriesProject));

        log.info(designPatternsProject.getHtml());
    }

}
