package com.bandiClasses.DMS.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;


/**
 * 
 * @author Pranathi Patlolla
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {

	
	
	List<Dog> findByName(String name);
	
	
	
}
