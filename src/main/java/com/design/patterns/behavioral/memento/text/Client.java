package com.design.patterns.behavioral.memento.text;

import com.design.patterns.behavioral.memento.text.text.TextArea;
import com.design.patterns.behavioral.memento.text.text.TextEditor;
import java.util.ArrayDeque;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextArea(new StringBuilder("Default text. ")), new ArrayDeque<>());
        textEditor.write("Memento ");
        textEditor.write("design ");
        textEditor.write("pattern is ");
        textEditor.write("bad");

        log.info(textEditor.getText());
        textEditor.undo();

        log.info(textEditor.getText());
        textEditor.write("great!");

        log.info(textEditor.getText());
    }
}
