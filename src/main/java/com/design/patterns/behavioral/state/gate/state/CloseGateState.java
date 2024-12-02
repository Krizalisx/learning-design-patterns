package com.design.patterns.behavioral.state.gate.state;

import com.design.patterns.behavioral.state.gate.context.Gate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CloseGateState implements GateState {

    private final Gate gate;

    @Override
    public void enter() {
        log.info("Customer can't enter. Gate is closed.");
    }

    @Override
    public void pay() {
        log.info("Customer paid. Opening the gate.");
        gate.setGateState(new OpenGateState(gate));
    }
}
