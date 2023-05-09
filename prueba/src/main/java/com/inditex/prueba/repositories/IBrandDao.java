package com.inditex.prueba.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inditex.prueba.models.Brand;

@Repository
public interface IBrandDao extends CrudRepository<Brand, Long>  {
	    
		
}

