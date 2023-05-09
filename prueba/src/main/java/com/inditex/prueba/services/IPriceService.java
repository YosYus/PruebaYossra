package com.inditex.prueba.services;

import java.util.List;

import com.inditex.prueba.models.Price;


public interface IPriceService {
	
	
	
	    Price obtenerDatos(String fecha, Integer productId,Integer brandId);	
	    
	    /**
		 * Method to get all the Prices
		 * @return
		 */
		public List<Price> getTodo();

}
