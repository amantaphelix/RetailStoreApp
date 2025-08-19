package com.litmus7.RetailStoreApp.ui;

import java.util.List;

import com.litmus7.RetailStoreApp.controller.ProductController;
import com.litmus7.RetailStoreApp.dto.Product;
import com.litmus7.RetailStoreApp.dto.ResponseDto;

public class RetailStoreApp {

    public static void main(String[] args) {
        ProductController productController = new ProductController();

        // 1. Add a product
        // Create a category object and fill details
        // Save via controller and store response
        ResponseDto<Boolean> addProductResponse = productController.addProduct(null); // pass product instance
        // Use addProductResponse to show result

        // 2. Show all products
        ResponseDto<List<Product>> viewAllResponse = productController.viewAllProducts();
        // Use viewAllResponse to display products

        // 3. Show products by category
        ResponseDto<List<Product>> productCategoryResponse = productController.viewProductsByCategory("categoryName");
        // Use productCategoryResponse to display category results

        // 4. Sort products
        // User can choose sorting option  (Ascending, priceDescending,by name) and pass to sorting function
        ResponseDto<List<Product>> sortProductResponse = productController.sorting("sortType");
        // Use sortProductResponse to display sorted list
    }
}
