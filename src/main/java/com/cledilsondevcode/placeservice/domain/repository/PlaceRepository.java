package com.cledilsondevcode.placeservice.domain.repository;

import com.cledilsondevcode.placeservice.api.PlaceRequest;
import com.cledilsondevcode.placeservice.domain.model.Place;

import java.util.List;

public interface PlaceRepository {

    List<Place> list();
    Place search (Long id);
    Place save(PlaceRequest place);
    void remove(Place place);


}
