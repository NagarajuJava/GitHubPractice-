package com.ojas.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ojas.entity.Hotel;


@Service
public interface HotelService {

	public Hotel SaveOrUpdate(Hotel hotel);
	public List<Hotel> getAllHotels();
	public Optional<Hotel> getHotelById(int id);
	public void delete(int id);
	public Hotel update(Hotel hotel);
}
