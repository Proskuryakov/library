package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.CountryDto;
import ru.vsu.cs.proskuryakov.library.item.model.CountryItem;

import java.util.List;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDto toDto(CountryItem item);

    List<CountryDto> toDto(List<CountryItem> items);

}
