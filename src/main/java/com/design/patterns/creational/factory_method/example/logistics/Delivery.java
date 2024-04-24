package com.design.patterns.creational.factory_method.example.logistics;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Delivery {

    private String productName;

}
