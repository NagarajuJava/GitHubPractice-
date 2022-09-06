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

import com.ojas.entity.PackageEntity;
import com.ojas.service.PackageServiceImpl;

@RestController
public class PackageController {
	@Autowired
private  PackageServiceImpl packService;
	@PostMapping("/addpackage")
	public PackageEntity addPackage(@RequestBody PackageEntity pack) {
		
		return packService.saveOrUpdate(pack);	
	}
	
	@GetMapping("/allpack")
	private List<PackageEntity> getAllUser() {
		return packService.getAllPackages();

	}
	@GetMapping("/package/{id}")
	public Optional<PackageEntity> getPackageById(@PathVariable int id){
		return packService.getPackageById(id);
		
	}
	@DeleteMapping("/package/{id}")
	public void delete(@PathVariable int id) {
		packService.delete(id);
	}
	@PutMapping("/package/{id}")
	public PackageEntity update(@PathVariable PackageEntity pack) {
		return packService.update(pack);
		
	}
	
}
