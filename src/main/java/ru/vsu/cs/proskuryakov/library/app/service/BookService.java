package ru.vsu.cs.proskuryakov.library.app.service;

import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;
import java.util.UUID;

public interface BookService {

    List<BookItem> getAllBook();

    BookItem getBook(UUID bookId);

    BookItem createBook(BookItem bookItem);

    BookItem saveBook(BookItem currentBook);

    void deleteBook(UUID bookId);
}
