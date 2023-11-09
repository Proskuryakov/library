package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.AuthorDto;
import ru.vsu.cs.proskuryakov.library.item.model.AuthorItem;

import java.util.List;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDto mapToDto(AuthorItem item);

    List<AuthorDto> mapToDto(List<AuthorItem> items);

    AuthorItem mapToItem(AuthorDto dto);

    List<AuthorItem> mapToItem(List<AuthorDto> dtos);
}
