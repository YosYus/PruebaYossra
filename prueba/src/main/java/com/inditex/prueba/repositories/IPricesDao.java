package com.inditex.prueba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inditex.prueba.models.Price;
import com.inditex.prueba.models.PriceId;

@Repository
public interface IPricesDao extends JpaRepository<Price, PriceId>  {
	    @Query("SELECT p FROM Price p WHERE p.id.startDate <= :fecha AND p.id.endDate >= :fecha AND p.id.productId = :productId AND p.id.brandId = :brandId ORDER BY p.priority DESC")
	    Price obtenerDatos(@Param("fecha") String fecha, @Param("productId") Integer productId, @Param("brandId") Integer brandId);	
	    
	    /**
	     * Method to get all the Prices
	     * @return
	     */
	    @Query("SELECT p FROM Price p")
		public List<Price> getTodo();
		
}
