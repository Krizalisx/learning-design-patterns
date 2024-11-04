package com.design.patterns.behavioral.command.light.command;

import com.design.patterns.behavioral.command.light.receiver.LightBulb;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LightsBrightnessIncreaseCommand implements LightCommand {

    private final LightBulb lightBulb;

    @Override
    public void execute() {
        lightBulb.increaseBrightness();
    }

    @Override
    public void unexecute() {
        lightBulb.decreaseBrightness();
    }
}
