package ru.vsu.cs.proskuryakov.library.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.cs.proskuryakov.library.item.model.BookItem;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookItem, UUID> {
}
