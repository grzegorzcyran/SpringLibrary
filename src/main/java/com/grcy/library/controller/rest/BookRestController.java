package com.grcy.library.controller.rest;

import com.grcy.library.model.Book;
import com.grcy.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/library/books")
public class BookRestController {

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(value = "/{id}")
    public Book getBookById(@PathVariable(name = "id") String id) {
        return bookService.getById(Long.parseLong(id));
    }
}
