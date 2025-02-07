package com.design.patterns.behavioral.chain_of_responsibility.filter.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayloadFilter extends BaseFilter {

    @Override
    public void execute(String request) {
        if (request.contains("payload")) {
            log.info("Payload filter executed");
            super.execute(request);
        } else {
            log.info("Payload filter stopped");
        }
    }
}
