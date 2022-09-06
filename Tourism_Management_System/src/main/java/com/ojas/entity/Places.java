package com.ojas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="places")
public class Places {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String placeName;

	private String state;
	private String city;
	private String description;
	
	
}
