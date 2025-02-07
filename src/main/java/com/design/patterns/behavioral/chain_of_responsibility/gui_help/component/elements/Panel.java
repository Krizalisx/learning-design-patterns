package com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.elements;

import static java.util.Objects.isNull;

import com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.Component;
import com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.Container;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Panel extends Container {

    private final String helpMessage;

    public Panel(List<Component> children, String helpMessage) {
        super(children);
        this.helpMessage = helpMessage;
    }

    @Override
    public void showHelp() {
        if (!isNull(helpMessage)) {
            log.info("Panel help message: {}", helpMessage);
        } else {
            super.showHelp();
        }
    }
}
