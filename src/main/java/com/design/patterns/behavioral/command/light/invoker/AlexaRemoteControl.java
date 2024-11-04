package com.design.patterns.behavioral.command.light.invoker;

import com.design.patterns.behavioral.command.light.command.LightCommand;
import lombok.Builder;

@Builder
public class AlexaRemoteControl implements RemoteControl {

    private final LightCommand on;
    private final LightCommand off;
    private final LightCommand up;
    private final LightCommand down;

    @Override
    public void on() {
        on.execute();
    }

    @Override
    public void off() {
        off.execute();
    }

    @Override
    public void up() {
        up.execute();
    }

    @Override
    public void down() {
        down.execute();
    }
}
