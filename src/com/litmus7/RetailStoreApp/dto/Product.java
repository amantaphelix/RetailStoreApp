package com.litmus7.RetailStoreApp.dto;

public abstract class Product {
    protected String productId;
    protected String productName;
    protected String category;
    protected ProductStatus status;
    protected double price;

    public Product() {}

    public Product(String productId, String productName, String category, ProductStatus status, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category=category;
        this.status = status;
        this.price = price;
    }

    public String getProductId() { 
    	return productId; 
    }
    public void setProductId(String productId) { 
    	this.productId = productId; 
    }

    public String getProductName() { 
    	return productName; 
    }
    public void setProductName(String productName) { 
    	this.productName = productName; 
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setCategory(String category) {
    	this.category=category;
    }
    
    public ProductStatus getStatus() { 
    	return status; 
    }
    
    public void setStatus(ProductStatus status) { 
    	this.status = status;
    }

    public double getPrice() { 
    	return price; 
    }
    public void setPrice(double price) { 
    	this.price = price; 
    }


}
