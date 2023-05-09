package com.inditex.prueba.controllers;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.inditex.prueba.repositories.IPricesDao;
import com.inditex.prueba.models.Price;


@ExtendWith(MockitoExtension.class)
class PricesControllerTest{
	@Mock
	IPricesDao pricesRepository;

	@InjectMocks
	PricesController pricesController;
	
//	private LocalDateTime fecha1 = LocalDateTime.of(2020, 6, 14, 10, 0, 0);
//	private LocalDateTime fecha2 = LocalDateTime.of(2020, 6, 14, 16, 0, 0);
//	private LocalDateTime fecha3 = LocalDateTime.of(2020, 6, 14, 21, 0, 0);
//	private LocalDateTime fecha4 = LocalDateTime.of(2020, 6, 15, 10, 0, 0);
//	private LocalDateTime fecha5 = LocalDateTime.of(2020, 6, 16, 21, 0, 0);
	private String fecha1 = "2020-06-14 10:00:00";
	private String fecha2 = "2020-06-14 16:00:00";
	private String fecha3 = "2020-06-14 21:00:00";
	private String fecha4 = "2020-06-15 10:00:00";
	private String fecha5 = "2020-06-16 21:00:00";
	private int productoId = 35455;
	private int brandId = 1;


	@Test
	public void testConsultarPrices1() {
		// Test case for 10:00 of day 14
		Price price = new Price();
		when(pricesRepository.obtenerDatos(fecha1, productoId, brandId)).thenReturn(price);

		ResponseEntity<Price> response = pricesController.consultarPrices(fecha1, productoId, brandId);

		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(price);
	}

	@Test
	public void testConsultarPrices2() {
		// Test case for 16:00 of day 14
		Price price = new Price();
		
		when(pricesRepository.obtenerDatos(fecha2, productoId, brandId)).thenReturn(price);
		ResponseEntity<Price> response = pricesController.consultarPrices(fecha2, productoId, brandId);

		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(price);
	}



	@Test
	public void testConsultarPrices3() {
		// Test case for 21:00 of day 14
		Price price = new Price();

		when(pricesRepository.obtenerDatos(fecha3, productoId, brandId)).thenReturn(price);

		ResponseEntity<Price> response = pricesController.consultarPrices(fecha3, productoId, brandId);

		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(price);
	}


	@Test
	public void testConsultarPrices4() {
		// Test case for 10:00 of day 15
		Price price = new Price();

		when(pricesRepository.obtenerDatos(fecha4, productoId, brandId)).thenReturn(price);

		ResponseEntity<Price> response = pricesController.consultarPrices(fecha4, productoId, brandId);

		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(price);
	}



	@Test
	public void testConsultarPrices5() {
		// Test case for 21:00 of day 16
		Price price = new Price();

		when(pricesRepository.obtenerDatos(fecha5, productoId, brandId)).thenReturn(price);

		ResponseEntity<Price> response = pricesController.consultarPrices(fecha5, productoId, brandId);

		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(price);
	}
}