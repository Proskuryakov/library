package ru.vsu.cs.proskuryakov.library.api.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDto {

    private int id;
    private String name;

    private List<CityDto> cities;

}
