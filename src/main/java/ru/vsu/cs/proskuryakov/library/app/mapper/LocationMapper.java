package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.LocationDto;
import ru.vsu.cs.proskuryakov.library.item.model.LocationItem;

import java.util.List;

@Mapper
public interface LocationMapper {
    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    LocationDto mapToDto(LocationItem item);

    List<LocationDto> mapToDto(List<LocationItem> items);

    LocationItem mapToItem(LocationDto dto);

}
