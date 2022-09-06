package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ojas.entity.Places;

@Service
public interface PlacesService {
public Places saveOrUpdate(Places places);
public List<Places> getAllPlaces();
public Optional<Places> getPlaceById(int id);
public void delete(int id);
public Places update(Places places);
}
