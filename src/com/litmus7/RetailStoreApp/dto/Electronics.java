package com.litmus7.RetailStoreApp.dto;

public class Electronics extends Product {
    private String brand;
    private int warrantyMonths;

    public Electronics() { 
    	super(); 
    }
    public Electronics(String productId, String productName, ProductStatus status,double price, String brand, int warrantyMonths) {
        super(productId, productName,"Electronics", status, price);
        this.brand=brand;
        this.warrantyMonths=warrantyMonths;
    }

    public String getBrand() { 
    	return brand; 
    }
    public void setBrand(String brand) {
    	this.brand=brand;
    }
    public int getWarrantyMonths() { 
    	return warrantyMonths;
    }
    public void setWarrantyMonths(int warrantyMonths) {
    	this.warrantyMonths=warrantyMonths;
    }
}
