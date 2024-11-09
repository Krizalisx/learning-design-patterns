package com.design.patterns.structural.bridge.view.model;

public class Book {

    public String getIsbn() {
        return "ISBN: 123456789";
    }

    public String getAuthor() {
        return "Author: John Smith";
    }

    public String getSummary() {
        return "Summary: Summary of the book";
    }

    public String getTitle() {
        return "Title: The Book";
    }

    public String getFrontImage() {
        return "Front Image";
    }

}
