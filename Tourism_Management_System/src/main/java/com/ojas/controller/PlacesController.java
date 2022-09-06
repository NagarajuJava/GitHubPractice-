package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Places;
import com.ojas.service.PlacesServiceImpl;

@RestController
public class PlacesController {
	@Autowired
private PlacesServiceImpl placesService;
	@PostMapping("/addPlaces")
	public Places addPlaces(@RequestBody Places places) {
		return placesService.saveOrUpdate(places);	
	}
	@GetMapping("/allPlaces")
	public List<Places> getAllPlaces(){
		return placesService.getAllPlaces();
		
	}
	@GetMapping("/places/{id}")
	public Optional<Places> getPlaceById(@PathVariable int id){
		return placesService.getPlaceById(id);	
	}
	@DeleteMapping("/places/{id}")
	public void delete(@PathVariable int id) {
		placesService.delete(id);
	}
	@PutMapping("/places/{id}")
	public Places update(@PathVariable Places places) {
		return placesService.update(places);
		
	}

}
