package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.CityDto;
import ru.vsu.cs.proskuryakov.library.item.model.CityItem;

import java.util.List;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(source = "name", target = "name")
    CityDto toDto(CityItem item);

    List<CityDto> toDto(List<CityItem> items);
}
