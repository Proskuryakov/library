package ru.vsu.cs.proskuryakov.library.app.controler;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.cs.proskuryakov.library.api.DictionaryApi;
import ru.vsu.cs.proskuryakov.library.api.model.CityDto;
import ru.vsu.cs.proskuryakov.library.api.model.CountryDto;
import ru.vsu.cs.proskuryakov.library.app.mapper.CountryMapper;
import ru.vsu.cs.proskuryakov.library.app.service.DictionaryService;
import ru.vsu.cs.proskuryakov.library.item.model.CountryItem;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DictionaryController implements DictionaryApi {

    private final DictionaryService dictionaryService;

    @Override
    public ResponseEntity<List<CountryDto>> getAllCountry() {
        List<CountryItem> allCountry = dictionaryService.getAllCountry();
        List<CountryDto> countryDtos = CountryMapper.INSTANCE.toDto(allCountry);
        return ResponseEntity.ok(countryDtos);
    }

    @Override
    public ResponseEntity<List<CityDto>> getAllCity() {
        return null;
    }
}
