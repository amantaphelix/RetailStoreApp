package com.litmus7.RetailStoreApp.controller;

import com.litmus7.RetailStoreApp.constants.ApplicationStatusCodes;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.ResponseDto;
import com.litmus7.RetailStoreApp.exception.ProductServiceException;
import com.litmus7.RetailStoreApp.service.ProductService;

import java.util.Comparator;
import java.util.List;

public class ProductController {
	private ProductService productService=new ProductService();
	
    public ResponseDto<Boolean> addProduct(Product product) {

    	try {
    		// Step 1: Validate user input
    		// Step 2: Call service to add product
            boolean result = productService.addProduct(product);
            if (result) {
                return new ResponseDto<>(ApplicationStatusCodes.SUCCESS, "SampleResponse", true);
            } else {
                return new ResponseDto<>(ApplicationStatusCodes.FAILURE, "SampleResponse", false);
            }
        } catch (ProductServiceException e) {
            return new ResponseDto<>(ApplicationStatusCodes.FAILURE,"SampleErrorResponse", false);
        }
    }

    public ResponseDto<List<Product>> viewAllProducts() {
        // Step 1: Call service to get all products
    	// Step 2: Return response
        return null;
    }

    public ResponseDto<List<Product>> viewProductsByCategory(String category) {
        // Step 1: Call service to get category products
    	// Step 2: Return response
        return null;
    }

    public ResponseDto<List<Product>> sorting(String sortOption) {
        // Step 1: Call service with sort option
        // Step 2: Return response
        return null;
    }

}
