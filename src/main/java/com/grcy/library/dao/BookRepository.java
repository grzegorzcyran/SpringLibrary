package com.grcy.library.dao;

import com.grcy.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Component - ogólna anotacja do oznaczania klasy zarządzanej przez Spring
@Repository //anotacja oznaczająca komponent (bean - klasę zarządzaną przez Springa) który odpowiada za
//dostęp do danych
//pozwala na tworzenie metod wybierających dane z tabel (jednej bądź wielu)
//@Repository pozwala na rzucenie wyjątkami typowo związanymi z bazą danych
//a @Component tego nie zrobi
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findById(Long id);

    Optional<Book> findBooksByAuthorAndTitle(String author, String title);

    List<Book> findBooksByAuthor(String author);

    //@uery - HQL albo JPQL (HQL to jedna z implementacji JPQL)
    //HQL - Hibenate Query Language
    //JPQL - JPA Query Language
    //@Query + "nic" albo plus "nativeQuery=false" - HQL / JPQL
    //@Query + "nativeQuery=true" - SQL
    //@NativeQuery - SQL
    @Query(value = "Select nextval('hibernate_sequence')", nativeQuery = true)
    Long getNextSeriesId();
}
