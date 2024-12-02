package com.design.patterns.behavioral.state.gate.state;

import com.design.patterns.behavioral.state.gate.context.Gate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class OpenGateState implements GateState {

    private final Gate gate;

    @Override
    public void enter() {
        log.info("Letting a customer in. Closing the gate.");
        gate.setGateState(new CloseGateState(gate));
    }

    @Override
    public void pay() {
        log.info("Rejecting payment. Gate is open.");
    }
}
