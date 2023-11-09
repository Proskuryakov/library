package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityItem {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private CountryItem country;

}
