package com.design.patterns.structural.decorator.datasource.decorator;

import com.design.patterns.structural.decorator.datasource.datasource.DataSource;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DataSourceDecorator implements DataSource {

    private final DataSource dataSource;

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
