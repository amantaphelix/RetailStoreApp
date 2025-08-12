package com.litmus7.RetailStoreApp.exception;

public class ProductDaoException extends Exception {

    public ProductDaoException(String message) {
        super(message);
    }

    public ProductDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
