package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "book")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookItem {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private int year;
    private int pageCount;
    private String description;

    @ManyToOne
    private PubHouseItem pubHouse;

    @ManyToOne
    private LocationItem location;

    @ManyToMany
    @JoinTable(name = "book_author",
        joinColumns = { @JoinColumn(name = "book_id") },
        inverseJoinColumns = { @JoinColumn(name = "author_id") })
    private List<AuthorItem> authors;

}
