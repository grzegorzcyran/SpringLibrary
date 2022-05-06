package com.grcy.library.controller;

public class BookDto {
    private String author;
    private String title;

    public BookDto(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookDto() {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
