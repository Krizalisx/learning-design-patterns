package com.design.patterns.behavioral.chain_of_responsibility.filter.filter;

public interface RequestFilter {

    void execute(String request);

    void setNext(RequestFilter requestFilter);

}
