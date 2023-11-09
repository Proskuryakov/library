package ru.vsu.cs.proskuryakov.library.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.proskuryakov.library.api.model.BookDto;

import java.util.List;

public interface BookApi {

    @GetMapping("/books")
    ResponseEntity<List<BookDto>> getAllBooks();

}
