package com.inditex.prueba.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Price implements Serializable {

	@EmbeddedId
	private PriceId id;
	
    @Column(name = "PRICE")
    private Double price;

    @Column(name = "CURR")
    private String currency;
    
    @Column(name = "PRICE_LIST")
    private int priceList;
    
    @Column(name = "PRIORITY")
    private Integer priority;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id", insertable = false, updatable = false)
    private Brand brand;
    
    public Price(PriceId id, int priceList, int priority, double price, String currency) {
        this.id = id;
        this.priceList = priceList;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
    }
    
//	public Price(int productId, int brandId, String start, String end, int listPrice, int priority, double price, String curr) {
//		this.productId = productId;
//		this.priceList= listPrice;
//		this.priority = priority;
//		this.price= price;
//		this.currency = curr;
//	}

	public Price() {
		// TODO Auto-generated constructor stub
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setId(PriceId priceId) {
		PriceId id = new PriceId();
		id.setStartDate(priceId.getStartDate());
		id.setEndDate(priceId.getEndDate());
		id.setProductId(priceId.getProductId());
		id.setBrandId(priceId.getBrandId());
		priceId = id;
		
	}
	
	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int i) {
		this.priceList = i;
	}

	
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}


}
