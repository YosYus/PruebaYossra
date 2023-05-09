package com.inditex.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inditex.prueba.models.Brand;
import com.inditex.prueba.models.Price;
import com.inditex.prueba.models.PriceId;
import com.inditex.prueba.repositories.IBrandDao;
import com.inditex.prueba.repositories.IPricesDao;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner initDataBaseBrandTableH2(IBrandDao brand) {
		 // Cleanup brand table
		brand.deleteAll();
		return args->{
			 brand.save(new Brand(1, "ZARA"));
		 };

	}
	

	@Bean
	CommandLineRunner initDataBasePriceTableH2(IPricesDao repository) {
		 // Cleanup employees table
		repository.deleteAllInBatch();
		return args->{
			repository.save(new Price(new PriceId(35455,1, "2020-06-14 00:00:00", "2020-12-31 23:59:59"),1, 0, 35.50, "EUR"));
			repository.save(new Price(new PriceId(35455,1, "2020-06-14 00:00:00", "2020-12-31 23:59:59"),1, 0, 35.50, "EUR"));
			repository.save(new Price(new PriceId(35455,1, "2020-06-14 15:00:00", "2020-06-14 18:30:00"), 2, 1, 25.45, "EUR"));
			repository.save(new Price(new PriceId(35455,1, "2020-06-15 00:00:00", "2020-06-15 11:00:00"), 3, 1, 30.50, "EUR"));
			repository.save(new Price(new PriceId(35455,1, "2020-06-15 16:00:00", "2020-12-31 23:59:59"), 4, 1, 38.95, "EUR"));
		};
	}
	
	
	

}
