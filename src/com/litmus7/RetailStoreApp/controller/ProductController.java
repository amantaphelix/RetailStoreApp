package com.litmus7.RetailStoreApp.controller;

import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.ResponseDto;
import com.litmus7.RetailStoreApp.exception.ProductServiceException;
import com.litmus7.RetailStoreApp.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService();

    public ResponseDto<Boolean> addProduct(Product product) {
        try {
            // Step 1: Call service to add product
            boolean result = productService.addProduct(product);

            if (result) {
                // Wrap success into ResponseDto and return
            } else {
                // Wrap failure into ResponseDto and return
            }
        } catch (ProductServiceException e) {
            // Wrap exception into ResponseDto and return
        }
        return null;
    }

    public ResponseDto<List<Product>> viewAllProducts() {
        try {
            // Step 1: Call service to fetch all products
            List<Product> products = productService.viewAllProducts();

            // Step 2: Wrap list into ResponseDto and return
        } catch (ProductServiceException e) {
            // Wrap exception into ResponseDto and return
        }
        return null;
    }

    public ResponseDto<List<Product>> viewProductsByCategory(String category) {
        try {
            // Step 1: Call service to fetch products by category
            List<Product> products = productService.viewProductsByCategory(category);

            // Step 2: Wrap list into ResponseDto and return
        } catch (ProductServiceException e) {
            // Wrap exception into ResponseDto and return
        }
        return null;
    }

    public ResponseDto<List<Product>> sorting(String sortOption) {
        try {
            // Step 1: Call service with sort option
            List<Product> products = productService.sorting(sortOption);

            // Step 2: Wrap sorted list into ResponseDto and return
        } catch (ProductServiceException e) {
            // Wrap exception into ResponseDto and return
        }
        return null;
    }
}
