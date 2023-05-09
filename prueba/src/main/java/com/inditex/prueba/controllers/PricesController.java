/**
 * 
 */
package com.inditex.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.prueba.models.Price;
import com.inditex.prueba.repositories.IPricesDao;







/**
 * @author Yosra
 *
 */
@RestController
@RequestMapping("/api")
public class PricesController {

	/**
	 * 
	 */
	@Autowired
	private IPricesDao  pricesRepository;
	
	@GetMapping(value="findAll")
	public List<Price> getPrices() {
		return pricesRepository.getTodo();
	}
	
	
	
	@GetMapping("/consultarPrices")
	//@ApiOperation(value = "Returns a final price", response = List.class)
	public ResponseEntity<Price> consultarPrices(@RequestParam("fecha") String fecha1,
			@RequestParam("productId") int idProducto,@RequestParam("brandId") int brandId){
		
		Price datos = pricesRepository.obtenerDatos(fecha1,idProducto,brandId);
		
		if(datos == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(datos);
		}
	}	

}
