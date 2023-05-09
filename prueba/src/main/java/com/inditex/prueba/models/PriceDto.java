package com.inditex.prueba.models;

import java.util.Objects;

public class PriceDto {

	public PriceDto() {
		// TODO Auto-generated constructor stub
	}



	private int productId;
	private int brandId;
	private Integer priceList;
	private String startDate;
	private String endDate;
	private Double price;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public Integer getPriceList() {
		return priceList;
	}
	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    PriceDto priceDto = (PriceDto) o;
	    return productId == priceDto.productId &&
	            brandId == priceDto.brandId &&
	            Objects.equals(priceList, priceDto.priceList) &&
	            Objects.equals(startDate, priceDto.startDate) &&
	            Objects.equals(endDate, priceDto.endDate) &&
	            Objects.equals(price, priceDto.price);
	}


}
