package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.PackageEntity;
import com.ojas.repo.PackageRepository;
@Service
public class PackageServiceImpl implements PackageService{

	@Autowired
	private PackageRepository packRepo;
	@Override
	public PackageEntity saveOrUpdate(PackageEntity pack) {
	
		return packRepo.save(pack);
	}
	@Override
	public List<PackageEntity> getAllPackages() {
		
		return packRepo.findAll();
	}
	@Override
	public Optional<PackageEntity> getPackageById(int id) {
		
		return packRepo.findById(id);
	}
	@Override
	public void delete(int id) {
		packRepo.deleteById(id);
		
	}
	@Override
	public PackageEntity update(PackageEntity pack) {
	
		return packRepo.save(pack);
	}

}
