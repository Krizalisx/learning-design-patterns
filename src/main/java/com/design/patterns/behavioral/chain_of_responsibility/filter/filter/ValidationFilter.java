package com.design.patterns.behavioral.chain_of_responsibility.filter.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidationFilter extends BaseFilter {

    @Override
    public void execute(String request) {
        if (request.contains("valid")) {
            log.info("Request is valid");
            super.execute(request);
        } else {
            log.info("Validation filter stopped");
        }
    }
}
