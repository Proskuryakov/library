package ru.vsu.cs.proskuryakov.library.app.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.proskuryakov.library.api.BookApi;
import ru.vsu.cs.proskuryakov.library.api.model.BookDto;
import ru.vsu.cs.proskuryakov.library.app.mapper.AuthorMapper;
import ru.vsu.cs.proskuryakov.library.app.mapper.BookMapper;
import ru.vsu.cs.proskuryakov.library.app.mapper.LocationMapper;
import ru.vsu.cs.proskuryakov.library.app.mapper.PubHouseMapper;
import ru.vsu.cs.proskuryakov.library.app.service.BookService;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BookController implements BookApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<List<BookDto>> getAllBooks() {
        List<BookItem> allBook = bookService.getAllBook();
        return ResponseEntity.ok(BookMapper.INSTANCE.mapToDto(allBook));
    }

    @Override
    public ResponseEntity<BookDto> getBook(UUID bookId) {
        BookItem book = bookService.getBook(bookId);
        return ResponseEntity.ok(BookMapper.INSTANCE.mapToDto(book));
    }

    @Override
    public ResponseEntity<BookDto> addBook(BookDto book) {
        BookItem bookItem = BookMapper.INSTANCE.mapToItem(book);
        bookItem.setId(UUID.randomUUID());
        BookItem createdBook = bookService.createBook(bookItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(BookMapper.INSTANCE.mapToDto(createdBook));
    }

    @Override
    public ResponseEntity<BookDto> updateBook(UUID bookId, BookDto newBook) {
        BookItem currentBook = bookService.getBook(bookId);
        currentBook.setName(newBook.getName());
        currentBook.setDescription(newBook.getDescription());
        currentBook.setYear(newBook.getYear());
        currentBook.setPageCount(newBook.getPageCount());

        currentBook.setLocation(LocationMapper.INSTANCE.mapToItem(newBook.getLocation()));
        currentBook.setPubHouse(PubHouseMapper.INSTANCE.mapToItem(newBook.getPubHouse()));
        currentBook.setAuthors(AuthorMapper.INSTANCE.mapToItem(newBook.getAuthors()));

        BookItem updatedBook = bookService.saveBook(currentBook);
        return ResponseEntity.ok(BookMapper.INSTANCE.mapToDto(updatedBook));
    }

    @Override
    public ResponseEntity<Void> deleteBook(UUID bookId) {
        bookService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }

}
