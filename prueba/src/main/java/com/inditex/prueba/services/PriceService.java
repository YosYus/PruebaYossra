package com.inditex.prueba.services;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.prueba.models.Price;
import com.inditex.prueba.repositories.IPricesDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class PriceService implements IPriceService {

	@Autowired
	private IPricesDao pricesDao;
	@Autowired
    private EntityManager entityManager;
	
	@Override
	public Price obtenerDatos(String fecha, Integer productId, Integer brandId) {
		   
		try {
			//LocalDateTime dateTime = LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			Query query = entityManager.createQuery("SELECT p FROM Price p WHERE p.id.startDate <= :fecha AND p.id.endDate >= :fecha AND p.id.productId = :productId AND p.id.brandId = :brandId ORDER BY p.priority DESC");
			query.setParameter("fecha", fecha);
			query.setParameter("productId", productId);
			query.setParameter("brandId", brandId);
			query.setMaxResults(1); // get only the first result
			return (Price) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}


	@Override
	public List<Price> getTodo() {
		return (List<Price>) pricesDao.findAll();
	}

    // Other CRUD methods from CrudRepository can be implemented here if needed


}
