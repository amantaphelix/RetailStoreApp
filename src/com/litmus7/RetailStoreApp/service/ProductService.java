package com.litmus7.RetailStoreApp.service;

import com.litmus7.RetailStoreApp.dao.ProductDao;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.exception.ProductDaoException;
import com.litmus7.RetailStoreApp.exception.ProductServiceException;

import java.util.Comparator;
import java.util.List;

public class ProductService {
    private ProductDao dao = new ProductDao();

    public boolean addProduct(Product product) throws ProductServiceException {
        try {
            // Step 1: Validate product
            // Step 2: Save product via DAO
            return dao.saveProduct(product);
        } catch (ProductDaoException e) {
        	//handle by throwing ProductServiceException
        }
        return false;
    }
    

    public List<Product> viewAllProducts() throws ProductServiceException {
        try {
            return dao.getAllProducts();
        } catch (ProductDaoException e) {
        	//handle by throwing ProductServiceException
        	 return null;
        }
       
    }

    public List<Product> viewProductsByCategory(String category) throws ProductServiceException {
        try {
            return dao.getProductsByCategory(category);
        } catch (ProductDaoException e) {
        	//handle by throwing ProductServiceException
        	 return null;
        }
    }

    public List<Product> sorting(String sortOption) throws ProductServiceException {
        try {
        	List<Product> product= dao.getAllProducts();
            // Fetch products using dao
        	//apply comparator from comparatorUtil based on sortOption
        	return product;	
        } catch (ProductDaoException e) {
        	//handle by throwing ProductServiceException
       	 	return null;
        }
    }

}
