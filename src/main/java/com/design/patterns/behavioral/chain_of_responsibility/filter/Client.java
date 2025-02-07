package com.design.patterns.behavioral.chain_of_responsibility.filter;

import com.design.patterns.behavioral.chain_of_responsibility.filter.filter.AuthFilter;
import com.design.patterns.behavioral.chain_of_responsibility.filter.filter.PayloadFilter;
import com.design.patterns.behavioral.chain_of_responsibility.filter.filter.ValidationFilter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        AuthFilter authFilter = new AuthFilter();
        PayloadFilter payloadFilter = new PayloadFilter();
        ValidationFilter validationFilter = new ValidationFilter();

        authFilter.setNext(payloadFilter);
        payloadFilter.setNext(validationFilter);

        authFilter.execute("auth");
        log.info("\n");
        authFilter.execute("auth_payload");
        log.info("\n");
        authFilter.execute("auth_payload_valid");
        log.info("\n");
        authFilter.execute("some");
    }
}
