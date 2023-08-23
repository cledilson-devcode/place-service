package com.cledilsondevcode.placeservice.web;

import com.cledilsondevcode.placeservice.api.PlaceResponse;
import com.cledilsondevcode.placeservice.domain.model.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place);
    }
}
