package ru.vsu.cs.proskuryakov.library.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vsu.cs.proskuryakov.library.api.model.CityDto;
import ru.vsu.cs.proskuryakov.library.api.model.CountryDto;

import java.util.List;

public interface DictionaryApi {

    @GetMapping("/countries")
    ResponseEntity<List<CountryDto>> getAllCountry();

    @GetMapping("/cities")
    ResponseEntity<List<CityDto>> getAllCity();

}
