package com.design.patterns.behavioral.command.light;

import com.design.patterns.behavioral.command.light.command.LightsBrightnessDecreaseCommand;
import com.design.patterns.behavioral.command.light.command.LightsBrightnessIncreaseCommand;
import com.design.patterns.behavioral.command.light.command.LightsOffCommand;
import com.design.patterns.behavioral.command.light.command.LightsOnCommand;
import com.design.patterns.behavioral.command.light.invoker.AlexaRemoteControl;
import com.design.patterns.behavioral.command.light.invoker.RemoteControl;
import com.design.patterns.behavioral.command.light.receiver.AlexaLightBulb;
import com.design.patterns.behavioral.command.light.receiver.LightBulb;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        LightBulb alexaLlightBulb = new AlexaLightBulb();

        RemoteControl alexaRemoteControl = AlexaRemoteControl.builder()
            .on(new LightsOnCommand(alexaLlightBulb))
            .off(new LightsOffCommand(alexaLlightBulb))
            .up(new LightsBrightnessIncreaseCommand(alexaLlightBulb))
            .down(new LightsBrightnessDecreaseCommand(alexaLlightBulb))
            .build();

        alexaRemoteControl.on();
        alexaRemoteControl.off();
        alexaRemoteControl.up();
        alexaRemoteControl.down();

    }

}
