package ru.vsu.cs.proskuryakov.library.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PubHouseDto {

    private int id;
    private String name;

}
