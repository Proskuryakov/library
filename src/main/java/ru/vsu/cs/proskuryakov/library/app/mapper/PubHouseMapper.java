package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.PubHouseDto;
import ru.vsu.cs.proskuryakov.library.item.model.PubHouseItem;

import java.util.List;

@Mapper
public interface PubHouseMapper {
    PubHouseMapper INSTANCE = Mappers.getMapper(PubHouseMapper.class);

    PubHouseDto mapToDto(PubHouseItem item);

    List<PubHouseDto> mapToDto(List<PubHouseItem> items);

    PubHouseItem mapToItem(PubHouseDto dto);

}
