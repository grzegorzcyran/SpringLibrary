package com.grcy.library.controller;

public class BookDto {
    private Long id;

    private String author;
    private String title;


    public BookDto(Long id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public BookDto(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookDto() {
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
