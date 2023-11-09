package ru.vsu.cs.proskuryakov.library.app.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.proskuryakov.library.app.exception.NotFoundException;
import ru.vsu.cs.proskuryakov.library.app.service.BookService;
import ru.vsu.cs.proskuryakov.library.item.BookRepository;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<BookItem> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public BookItem getBook(UUID bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new NotFoundException("Book with this id not found"));
    }

    @Override
    public BookItem createBook(BookItem bookItem) {
        return saveBook(bookItem);
    }

    @Override
    public BookItem saveBook(BookItem book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public void deleteBook(UUID bookId) {
        bookRepository.deleteById(bookId);
    }

}
