package com.design.patterns.structural.decorator.datasource;

import com.design.patterns.structural.decorator.datasource.datasource.FileDataSource;
import com.design.patterns.structural.decorator.datasource.decorator.EncryptionDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource(
            "src/main/java/com/design/patterns/structural/decorator/datasource/datasource/FileDataSource.java");
        String data = fileDataSource.readData();
        log.info(data);

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        String data2 = encryptionDecorator.readData();
        log.info(data2);
    }

}
