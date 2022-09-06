package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ojas.entity.PackageEntity;


@Service
public interface PackageService {
	public PackageEntity saveOrUpdate(PackageEntity pack);
	public List<PackageEntity> getAllPackages();
	public Optional<PackageEntity> getPackageById(int id);
	public void delete(int id);
	public PackageEntity update(PackageEntity pack);
}
