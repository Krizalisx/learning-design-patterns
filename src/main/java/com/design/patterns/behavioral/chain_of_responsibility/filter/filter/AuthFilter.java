package com.design.patterns.behavioral.chain_of_responsibility.filter.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthFilter extends BaseFilter {

    @Override
    public void execute(String request) {
        if (request.contains("auth")) {
            log.info("Auth filter executed");
            super.execute(request);
        } else {
            log.info("Auth filter stopped");
        }
    }
}
