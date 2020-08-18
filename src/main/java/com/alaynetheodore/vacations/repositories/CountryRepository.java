package com.alaynetheodore.vacations.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaynetheodore.vacations.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

	Optional<Country> findByName(String name);
	
}