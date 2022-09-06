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

import com.ojas.entity.Hotel;
import com.ojas.entity.PackageEntity;
import com.ojas.service.HotelServiceImpl;

@RestController
public class HotelController {
	@Autowired
private HotelServiceImpl hotelService;
	@PostMapping("/addHotel")
public Hotel addHotel(@RequestBody Hotel hotel) {
	return hotelService.SaveOrUpdate(hotel);	
}
	@GetMapping("/allHotel")
	private List<Hotel> getAllHotels(){
		return hotelService.getAllHotels();
		
	}
	
	@GetMapping("/hotel/{id}")
	public Optional<Hotel> getHotelById(@PathVariable int id){
		return hotelService.getHotelById(id);
		
	}
	@DeleteMapping("/hotel/{id}")
	public void delete(@PathVariable int id) {
		hotelService.delete(id);
	}
	@PutMapping("/hotel/{id}")
	public Hotel update(@PathVariable Hotel hotel) {
		return hotelService.update(hotel);
		
	}
}
