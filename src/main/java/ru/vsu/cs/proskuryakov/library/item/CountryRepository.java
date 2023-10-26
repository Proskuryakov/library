package ru.vsu.cs.proskuryakov.library.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.cs.proskuryakov.library.item.model.CountryItem;

@Repository
public interface CountryRepository extends JpaRepository<CountryItem, Integer> {
}
