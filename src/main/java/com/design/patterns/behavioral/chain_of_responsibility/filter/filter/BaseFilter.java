package com.design.patterns.behavioral.chain_of_responsibility.filter.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseFilter implements RequestFilter {

    private RequestFilter next;

    @Override
    public void execute(String request) {
        if (next != null) {
            next.execute(request);
        } else {
            log.info("Next filter is null.");
        }
    }

    @Override
    public void setNext(RequestFilter requestFilter) {
        this.next = requestFilter;
    }
}
