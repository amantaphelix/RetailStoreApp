package com.litmus7.RetailStoreApp.dto;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing() { 
    	super(); 
    }
    public Clothing(String productId, String productName, ProductStatus status,double price, String size, String material) {
        super(productId, productName,"Clothing", status, price);
        this.size=size;
        this.material=material;
    }

    public String getSize() { 
    	return size; 
    }
    public void setSize(String size) {
    	this.size=size;
    }
    public String getMaterial() { 
    	return material; 
    }
    public void setMaterial(String material) {
    	this.material=material;
    }
}
