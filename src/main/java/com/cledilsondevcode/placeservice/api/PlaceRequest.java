package com.cledilsondevcode.placeservice.api;

import java.time.LocalDateTime;

public class PlaceRequest {

    private String name;

    private String slug;

    private String state;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public PlaceRequest(String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.slug = slug;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
