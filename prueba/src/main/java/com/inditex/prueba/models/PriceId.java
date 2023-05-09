package com.inditex.prueba.models;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PriceId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PriceId() {
    }

    public PriceId(int productId,int brandId, String startDate, String endDate) {
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.productId = productId;
    }

	@Column(name = "PRODUCT_ID")
	private int productId;
	

	@Column(name = "BRAND_ID")
    private int brandId;

    @Column(name = "START_DATE")
    private String startDate;

    @Column(name = "END_DATE")
    private String endDate;
  
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int i) {
		this.brandId = i;
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


	public int getProductId() {
		return productId;
	}

	public void setProductId(int i) {
		this.productId = i;
	}


	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + brandId;
	    result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	    result = prime * result + productId;
	    result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
	    return result;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof PriceId)) {
	        return false;
	    }
	    PriceId other = (PriceId) obj;
	    return this.productId == other.productId &&
	            this.brandId == other.brandId &&
	            Objects.equals(this.startDate, other.startDate) &&
	            Objects.equals(this.endDate, other.endDate);
	}


}

