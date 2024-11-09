package com.design.patterns.structural.bridge.view.resource;

import com.design.patterns.structural.bridge.view.model.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookMediaResourceAdapter implements MediaResource {

    private final Book book;

    @Override
    public String getSnippet() {
        return book.getSummary();
    }

    @Override
    public String getUrl() {
        return book.getIsbn();
    }

    @Override
    public String getImage() {
        return book.getFrontImage();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }
}
