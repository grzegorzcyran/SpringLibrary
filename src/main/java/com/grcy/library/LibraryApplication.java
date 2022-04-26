package com.grcy.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
}

/**
 * MVC
 * Model - Dane i metody do ich pobierania / zapisywania / usuwania / modyfikowania
 * View - warstwa prezentacji czyli to jak dane są widoczne dla użytkownika aplikacji (frontend)
 * Controller - pośrednik, po akcji użytkownika (np. wciśnięcie przycisku) przegenerowuje widok z nowymi / innymi danymi
 * pobranymi z modelu - jeśli trzeba to po drodze następuje obróbka tych danych
 */
