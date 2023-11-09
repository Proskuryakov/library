package ru.vsu.cs.proskuryakov.library.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.vsu.cs.proskuryakov.library.api.model.BookDto;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto mapToDto(BookItem item);

    List<BookDto> mapToDto(List<BookItem> items);

    BookItem mapToItem(BookDto dto);

}
