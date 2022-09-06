package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Places;
import com.ojas.repo.PlacesRepository;

@Service
public class PlacesServiceImpl implements PlacesService {

	@Autowired
	private PlacesRepository placesRepo;

	@Override
	public Places saveOrUpdate(Places places) {
		return placesRepo.save(places);
	}

	@Override
	public List<Places> getAllPlaces() {
		return placesRepo.findAll();
	}

	@Override
	public Optional<Places> getPlaceById(int id) {
		return placesRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		placesRepo.deleteById(id);

	}

	@Override
	public Places update(Places places) {
		return placesRepo.save(places);
	}

}
