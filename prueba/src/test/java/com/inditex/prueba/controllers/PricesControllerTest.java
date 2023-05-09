package com.inditex.prueba.controllers;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.inditex.prueba.services.IPriceService;
import com.inditex.prueba.models.Price;
import com.inditex.prueba.models.PriceId;
import com.inditex.prueba.models.PriceDto;


@ExtendWith(MockitoExtension.class)
class PricesControllerTest{
	@Mock
	IPriceService pricesRepository;

	@InjectMocks
	PricesController pricesController;

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
		PriceId priceId = new PriceId();
		price.setCurrency("EUR");
		price.setPrice(35.5);
		price.setPriceList(1);
		price.setPriority(0);
		priceId.setProductId(35455);
		priceId.setBrandId(1);
		priceId.setStartDate(fecha1);
		priceId.setEndDate(fecha1);
		price.setId(priceId);
		PriceDto priceDto = new PriceDto();
		when(pricesRepository.obtenerDatos(fecha1, productoId, brandId)).thenReturn(price);
		priceDto.setProductId(price.getId().getProductId());
		priceDto.setBrandId(price.getId().getBrandId());
		priceDto.setPriceList(price.getPriceList());
		priceDto.setStartDate(price.getId().getStartDate());
		priceDto.setEndDate(price.getId().getEndDate());
		priceDto.setPrice(price.getPrice());
		ResponseEntity<PriceDto> response = pricesController.consultarPrices(fecha1, productoId, brandId);
		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(priceDto);

	}

	@Test
	public void testConsultarPrices2() {
		// Test case for 16:00 of day 14
		Price price = new Price();
		PriceId priceId = new PriceId();
		price.setCurrency("EUR");
		price.setPrice(25.45);
		price.setPriceList(2);
		price.setPriority(0);
		priceId.setProductId(35455);
		priceId.setBrandId(1);
		priceId.setStartDate(fecha2);
		priceId.setEndDate(fecha2);
		price.setId(priceId);
		PriceDto priceDto = new PriceDto();
		when(pricesRepository.obtenerDatos(fecha2, productoId, brandId)).thenReturn(price);
		priceDto.setProductId(price.getId().getProductId());
		priceDto.setBrandId(price.getId().getBrandId());
		priceDto.setPriceList(price.getPriceList());
		priceDto.setStartDate(price.getId().getStartDate());
		priceDto.setEndDate(price.getId().getEndDate());
		priceDto.setPrice(price.getPrice());
		ResponseEntity<PriceDto> response = pricesController.consultarPrices(fecha2, productoId, brandId);
		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(priceDto);
	}



	@Test
	public void testConsultarPrices3() {
		// Test case for 21:00 of day 14
		Price price = new Price();
		PriceId priceId = new PriceId();
		price.setCurrency("EUR");
		price.setPrice(35.5);
		price.setPriceList(1);
		price.setPriority(0);
		priceId.setProductId(35455);
		priceId.setBrandId(1);
		priceId.setStartDate(fecha3);
		priceId.setEndDate(fecha3);
		price.setId(priceId);
		PriceDto priceDto = new PriceDto();

		when(pricesRepository.obtenerDatos(fecha3, productoId, brandId)).thenReturn(price);
		priceDto.setProductId(price.getId().getProductId());
		priceDto.setBrandId(price.getId().getBrandId());
		priceDto.setPriceList(price.getPriceList());
		priceDto.setStartDate(price.getId().getStartDate());
		priceDto.setEndDate(price.getId().getEndDate());
		priceDto.setPrice(price.getPrice());
		ResponseEntity<PriceDto> response = pricesController.consultarPrices(fecha3, productoId, brandId);
		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(priceDto);

	}


	@Test
	public void testConsultarPrices4() {
		// Test case for 10:00 of day 15
		Price price = new Price();
		PriceId priceId = new PriceId();
		price.setCurrency("EUR");
		price.setPrice(30.5);
		price.setPriceList(3);
		price.setPriority(1);
		priceId.setProductId(35455);
		priceId.setBrandId(1);
		priceId.setStartDate(fecha4);
		priceId.setEndDate(fecha4);
		price.setId(priceId);
		PriceDto priceDto = new PriceDto();
		when(pricesRepository.obtenerDatos(fecha4, productoId, brandId)).thenReturn(price);
		priceDto.setProductId(price.getId().getProductId());
		priceDto.setBrandId(price.getId().getBrandId());
		priceDto.setPriceList(price.getPriceList());
		priceDto.setStartDate(price.getId().getStartDate());
		priceDto.setEndDate(price.getId().getEndDate());
		priceDto.setPrice(price.getPrice());
		ResponseEntity<PriceDto> response = pricesController.consultarPrices(fecha4, productoId, brandId);
		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(priceDto);

	}



	@Test
	public void testConsultarPrices5() {
		// Test case for 21:00 of day 16
		Price price = new Price();
		PriceId priceId = new PriceId();
		price.setCurrency("EUR");
		price.setPrice(38.95);
		price.setPriceList(4);
		price.setPriority(1);
		priceId.setProductId(35455);
		priceId.setBrandId(1);
		priceId.setStartDate(fecha5);
		priceId.setEndDate(fecha5);
		price.setId(priceId);
		PriceDto priceDto = new PriceDto();

		when(pricesRepository.obtenerDatos(fecha5, productoId, brandId)).thenReturn(price);
		priceDto.setProductId(price.getId().getProductId());
		priceDto.setBrandId(price.getId().getBrandId());
		priceDto.setPriceList(price.getPriceList());
		priceDto.setStartDate(price.getId().getStartDate());
		priceDto.setEndDate(price.getId().getEndDate());
		priceDto.setPrice(price.getPrice());
		ResponseEntity<PriceDto> response = pricesController.consultarPrices(fecha5, productoId, brandId);
		assert(response.getStatusCode()).isSameCodeAs(HttpStatus.OK);
		assert(response.getBody()).equals(priceDto);
	}
}