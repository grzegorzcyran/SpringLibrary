package com.grcy.library.service;

import com.grcy.library.controller.BookDto;
import com.grcy.library.dao.BookRepository;
import com.grcy.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//może też być @Component
//ale oznaczenie @Service mówi że mamy do czynienia z klasą która wykonuje jakąś logikę biznesową
@Transactional
public class BookService {

    //@Autowired - niezalecane
    private BookRepository  bookRepository;

    /**
     * Autowired (i nie tylko)
     * odpowiada za zainicjowanie pola - ma to zrobić Spring
     * można autowired nałożyć:
     *  - na pole - niezalecane
     *  - na setter - ok, ale lepiej konstruktorem
     *  - na konstruktor - najbardziej polecana opcja
     */

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getById(Long id) {

        return bookRepository.findById(id)
                .orElseGet(() -> {
                    System.out.println("Book not found");
                    return new Book();
                });
    }

    public List<Book> getAllBooks() {
        System.out.println("Getting all books");
        return bookRepository.findAll();
    }

    public Book saveBook(BookDto bookDto) {
        return null;
    }
}
