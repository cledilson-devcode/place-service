package com.cledilsondevcode.placeservice.domain.repository;

import com.cledilsondevcode.placeservice.domain.model.Place;

import java.util.List;

public interface PlaceRepository {

    List<Place> list();
    Place search (Long id);
    Place save(Place place);
    void remove(Place place);


}
