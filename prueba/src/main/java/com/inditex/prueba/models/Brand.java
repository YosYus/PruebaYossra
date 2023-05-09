package com.inditex.prueba.models;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "BRANDS")
public class Brand {

	public Brand() {
	}

	@Id
	@Column(name = "ID")
	private int id;


	@Column(name = "BRAND_NAME")
	private String name;


	 @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Price> prices = new ArrayList<Price>();	
	
	public Brand(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	  public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public List<Price> getPrices() {
	        return prices;
	    }

	    public void setPrices(ArrayList<Price> prices) {
	        this.prices = prices;
	    }
	}


