package com.litmus7.RetailStoreApp.dao;

import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.exception.ProductDaoException;

import java.util.List;

public class ProductDao {


    public boolean saveProduct(Product product) throws ProductDaoException {
        // Step 1: Append product to CSV file.
        // Step 2: If any error occurs while saving, throw ProductDaoException.
        return false;
    }

    public List<Product> getAllProducts() throws ProductDaoException {
        // Step 1: Read all products from CSV file.
        // Step 2: If any error occurs while fetching data, throw ProductDaoException.
        // Step 3: Return list of products.
        return null;
    }

    public List<Product> getProductsByCategory(String category) throws ProductDaoException {
        // Step 1: Read products from CSV file.
        // Step 2: Filter products by category.
        // Step 3: If any error occurs while fetching data, throw ProductDaoException.
        // Step 4: Return filtered list of products.
        return null;
    }
}
