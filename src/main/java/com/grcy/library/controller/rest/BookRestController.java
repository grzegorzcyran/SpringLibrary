package com.grcy.library.controller.rest;

import com.grcy.library.controller.BookDto;
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

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(value = "/{id}")
    public Book getBookById(@PathVariable(name = "id") String id) {
        return bookService.getById(Long.parseLong(id));
    }

    //POST służy do wprowadzania nowych rekordów (encji)
    @PostMapping
    public Book addBook(@RequestBody BookDto bookDto) {
        return bookService.saveBook(bookDto);
    }

    //PUT służy do korekty całego rekordu (encji)
    @PutMapping
    public Book modifyBook(@RequestBody BookDto bookDto) {
        return bookService.saveBook(bookDto);
    }

    //PATCH służy do poprawiania pojedynczych pól rekordu (encji)
    @PatchMapping(value = "/{id}/author")
    public Book modifyAuthor(@PathVariable("id") String id, @RequestParam(value = "author") String author) {
        return bookService.modifyAuthor(Long.valueOf(id), author);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }
}
