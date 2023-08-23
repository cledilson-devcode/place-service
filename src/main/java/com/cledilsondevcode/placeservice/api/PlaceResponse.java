package com.cledilsondevcode.placeservice.api;

import com.cledilsondevcode.placeservice.domain.model.Place;

import java.time.LocalDateTime;

public class PlaceResponse {

    private String name;

    private String slug;

    private String state;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public PlaceResponse(Place entity) {
        this.name = entity.getName();
        this.slug = entity.getSlug();
        this.state = entity.getState();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdatedAt();
    }



    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getState() {
        return state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
