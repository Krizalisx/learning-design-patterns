package com.design.patterns.behavioral.state.gate;

import com.design.patterns.behavioral.state.gate.context.Gate;
import com.design.patterns.behavioral.state.gate.state.OpenGateState;

public class Client {

    public static void main(String[] args) {
        Gate gate = new Gate();
        gate.setGateState(new OpenGateState(gate));

        gate.doPay();
        gate.doEnter();
        gate.doEnter();
        gate.doPay();
    }
}
