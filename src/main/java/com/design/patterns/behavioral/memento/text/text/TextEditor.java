package com.design.patterns.behavioral.memento.text.text;

import com.design.patterns.behavioral.memento.text.text.TextArea.Memento;
import java.util.ArrayDeque;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextEditor {

    private final TextArea textArea;
    private final ArrayDeque<Memento> history;

    public void write(String text) {
        textArea.write(text);
        history.addLast(textArea.getSnapshot());
    }

    public String getText() {
        return textArea.getText();
    }

    public void undo() {
        history.pollLast();
        if (!history.isEmpty()) {
            textArea.restore(history.pollLast());
        }
    }
}
