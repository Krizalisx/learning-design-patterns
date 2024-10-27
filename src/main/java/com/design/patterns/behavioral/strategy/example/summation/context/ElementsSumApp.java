package com.design.patterns.behavioral.strategy.example.summation.context;

import com.design.patterns.behavioral.strategy.example.summation.strategy.ISumStrategy;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class ElementsSumApp {

    private ISumStrategy iSumStrategy;

    public Integer getSum(Collection<Integer> collection) {
        return collection.stream().reduce(0, (a, b) -> iSumStrategy.sum(a, b));
    }
}
