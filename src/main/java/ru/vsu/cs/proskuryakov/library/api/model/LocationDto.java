package ru.vsu.cs.proskuryakov.library.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto {

    private int id;
    private String building;
    private String sector;
    private int shelf;
    private int bookshelf;

}
