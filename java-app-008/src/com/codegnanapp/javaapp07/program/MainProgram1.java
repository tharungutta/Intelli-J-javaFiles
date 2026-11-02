package com.codegnanapp.javaapp07.program;

import com.codegnanapp.javaapp07.operation.ProductOperations;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
        var productOperations = new ProductOperations();
      //  productOperations.displayProducts();
      //  productOperations.displayProductsFromCategory("Electronics");
       // productOperations.displayProductsFromSubCategory("Clothing","Women's Wear");
        double totalInventoryValue = productOperations.getTotalProductsValue();
        out.println("Total Inventory Value: INR " + totalInventoryValue);
    }
}
