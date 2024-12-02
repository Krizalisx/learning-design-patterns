package com.design.patterns.behavioral.state.gate.context;

import com.design.patterns.behavioral.state.gate.state.GateState;
import lombok.Setter;

@Setter
public class Gate {

    private GateState gateState;

    public void doEnter() {
        gateState.enter();
    }

    public void doPay() {
        gateState.pay();
    }
}
