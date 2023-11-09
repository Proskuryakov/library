package ru.vsu.cs.proskuryakov.library.app.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.proskuryakov.library.api.BookApi;
import ru.vsu.cs.proskuryakov.library.api.model.BookDto;
import ru.vsu.cs.proskuryakov.library.app.mapper.BookMapper;
import ru.vsu.cs.proskuryakov.library.app.service.BookService;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController implements BookApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<List<BookDto>> getAllBooks() {
        List<BookItem> allBook = bookService.getAllBook();
        return ResponseEntity.ok(BookMapper.INSTANCE.mapToDto(allBook));
    }

}
