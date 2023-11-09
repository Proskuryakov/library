package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "author")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorItem {

    @Id
    @GeneratedValue
    private Integer id;
    private String fio;

}
