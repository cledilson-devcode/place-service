package com.cledilsondevcode.placeservice.infrastructure.repository;

import com.cledilsondevcode.placeservice.domain.model.Place;
import com.cledilsondevcode.placeservice.domain.repository.PlaceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Place> list() {

        TypedQuery query = manager.createQuery("from Place", Place.class);

        return query.getResultList();
    }

    @Override
    public Place search(Long id) {
        return manager.find(Place.class, id);
    }

    @Transactional
    @Override
    public Place save(Place place) {
        return manager.merge(place);
    }

    @Transactional
    @Override
    public void remove(Place place) {
        place = search(place.getId());
        manager.remove(place);
    }
}
