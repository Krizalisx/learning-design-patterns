package com.design.patterns.structural.decorator.datasource.decorator;

import com.design.patterns.structural.decorator.datasource.datasource.DataSource;
import java.util.Arrays;
import java.util.Base64;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += 1;
        }

        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        try {
            byte[] result = Base64.getDecoder().decode(data);
            for (int i = 0; i < result.length; i++) {
                result[i] -= 1;
            }

            return Arrays.toString(result);
        } catch (IllegalArgumentException e) {
            log.error("Failed to decode data.", e);
            return data;
        }

    }
}
