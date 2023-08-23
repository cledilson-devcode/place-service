package com.cledilsondevcode.placeservice.web;

import com.cledilsondevcode.placeservice.domain.model.Place;
import com.cledilsondevcode.placeservice.domain.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceRepository placeRepository;

    @Autowired
    public PlaceController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Place created(@RequestBody Place place){

        return placeRepository.save(place);

    }


}
