package com.design.patterns.behavioral.chain_of_responsibility.gui_help.component;

import static java.util.Objects.isNull;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Component implements ComponentWithContextualHelp {

    private String helpMessage = "No help available";
    protected Container container;

    @Override
    public void showHelp() {
        if (!isNull(helpMessage)) {
            log.info("Help message: {}", helpMessage);
        } else {
            container.showHelp();
        }
    }
}
