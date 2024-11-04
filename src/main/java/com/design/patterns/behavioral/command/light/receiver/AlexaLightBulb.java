package com.design.patterns.behavioral.command.light.receiver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlexaLightBulb implements LightBulb {

    @Override
    public void lightsOn() {
        log.info("Alexa light bulb is on");
    }

    @Override
    public void lightsOff() {
        log.info("Alexa light bulb is off");
    }

    @Override
    public void increaseBrightness() {
        log.info("Alexa light bulb brightness increased");
    }

    @Override
    public void decreaseBrightness() {
        log.info("Alexa light bulb brightness decreased");
    }
}
