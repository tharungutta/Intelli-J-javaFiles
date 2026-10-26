package com.codegnan.app.javaapp04.main;

import com.codegnan.app.javaapp04.BlackFridaySale;
import com.codegnan.app.javaapp04.entity.Product;
import com.codegnan.app.javaapp04.operation.ProductOperations;

import static java.lang.System.out;

public class MainProduct {
    public static void main(String[] args) {
        var p = new ProductOperations();

        var products = p.getProducts();
        for (Product product : products) {
            out.println(product);
        }

        out.println();
        boolean isProductPriceUpdated = p.updateProductPrice(1, 10000);

        if (isProductPriceUpdated) {
            out.println("Product price updated successfully");
        } else {
            out.println("Product not found");
        }

        p.displayProducts();


        var blackFridaySale = new BlackFridaySale();
       var discountAmount =  blackFridaySale.discountAmount(1000);
        out.println(discountAmount);
    }
}
