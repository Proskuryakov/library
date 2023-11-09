package ru.vsu.cs.proskuryakov.library.app.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.proskuryakov.library.app.service.BookService;
import ru.vsu.cs.proskuryakov.library.item.BookRepository;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<BookItem> getAllBook() {
        return bookRepository.findAll();
    }

}
