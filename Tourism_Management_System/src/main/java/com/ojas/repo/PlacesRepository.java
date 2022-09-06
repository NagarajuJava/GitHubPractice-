package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Places;
@Repository
public interface PlacesRepository extends JpaRepository<Places, Integer> {

}
