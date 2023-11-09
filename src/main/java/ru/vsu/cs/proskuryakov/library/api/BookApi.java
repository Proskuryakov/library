package ru.vsu.cs.proskuryakov.library.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.proskuryakov.library.api.model.BookDto;

import java.util.List;
import java.util.UUID;

public interface BookApi {

    @GetMapping("/books")
    ResponseEntity<List<BookDto>> getAllBooks();

    @GetMapping("/books/{bookId}")
    ResponseEntity<BookDto> getBook(
            @PathVariable("bookId")
            UUID bookId
    );

    @PostMapping("/books")
    ResponseEntity<BookDto> addBook(
            @RequestBody
            BookDto book
    );

    @PutMapping("/books/{bookId}")
    ResponseEntity<BookDto> updateBook(
            @PathVariable("bookId")
            UUID bookId,

            @RequestBody
            BookDto book
    );

    @DeleteMapping("/books/{bookId}")
    ResponseEntity<Void> deleteBook(
            @PathVariable("bookId")
            UUID bookId
    );

}
