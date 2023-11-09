package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "location")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationItem {

    @Id
    @Generated
    private Integer id;
    private String building;
    private String sector;
    private int shelf;
    private int bookshelf;

}
