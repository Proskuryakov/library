package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "country")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryItem {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "country")
    private List<CityItem> cities;

}
