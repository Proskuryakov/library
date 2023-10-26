package ru.vsu.cs.proskuryakov.library.app.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.cs.proskuryakov.library.app.service.DictionaryService;
import ru.vsu.cs.proskuryakov.library.item.CountryRepository;
import ru.vsu.cs.proskuryakov.library.item.model.CountryItem;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DictionaryServiceImpl implements DictionaryService {

    private final CountryRepository countryRepository;

    @Override
    public List<CountryItem> getAllCountry() {
        return countryRepository.findAll();
    }

}
