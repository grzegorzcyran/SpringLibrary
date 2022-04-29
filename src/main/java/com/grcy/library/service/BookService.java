package com.grcy.library.service;

import com.grcy.library.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
