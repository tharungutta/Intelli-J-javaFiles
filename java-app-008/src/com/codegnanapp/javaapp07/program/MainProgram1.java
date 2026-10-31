package com.codegnanapp.javaapp07.program;

import com.codegnanapp.javaapp07.operation.ProductOperations;

public class MainProgram1 {
    public static void main(String[] args) {
        var productOperations = new ProductOperations();
      //  productOperations.displayProducts();
      //  productOperations.displayProductsFromCategory("Electronics");
        productOperations.displayProductsFromSubCategory("Clothing","Women's Wear");
    }
}
