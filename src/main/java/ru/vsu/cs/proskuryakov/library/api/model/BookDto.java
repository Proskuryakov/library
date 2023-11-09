package ru.vsu.cs.proskuryakov.library.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private UUID id;
    private String name;
    private int year;
    private int pageCount;
    private String description;
    private PubHouseDto pubHouse;
    private LocationDto location;

    private List<AuthorDto> authors;

}
