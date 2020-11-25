package com.db.sqlitelab;

import org.junit.Test;
import static org.junit.Assert.*;

import java.security.PublicKey;

public class ProductTest {

    @Test
    public void checkProductName() {
        Product aProduct = new Product(1, "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());

    }


    @Test
    public void checkProductId() {
        Product aProduct = new Product(1, "DELL MONITOR", 180);
        assertEquals("Check the name of the product", 1, aProduct.getID());
    }


    @Test
    public void checkProductPrice() {
        Product aProduct = new Product(1, "DELL MONITOR", 180);
        assertEquals("Check the name of the product", 0, aProduct.getSku());

    }
}