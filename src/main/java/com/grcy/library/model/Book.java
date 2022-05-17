package com.grcy.library.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/**
 * @Entity to pierwsza OBOWIĄZKOWA anotacja (JPA / Hibernate) do odwzorowania klasy na tabelę
 * Klasa która ma @Entity to ENCJA - czyli klasa która odwzorowuje tabelę bazodanową
 */
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    /**
     * Id jest drugą niezbędną anotacją dla JPA / Hibernate
     */
    private Long id;

    private String title;
    private String author;

}
