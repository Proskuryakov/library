package ru.vsu.cs.proskuryakov.library.item.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    @Generated
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "country")
    private List<CityItem> cities;

}
