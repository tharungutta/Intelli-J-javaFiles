package com.codegnan.app.javapp14.program;

import com.codegnan.app.javapp14.entity.Product;

import java.util.TreeSet;

public class MainProgram2 {
    public static void main(String[] args) {
        Product product1 = new Product(101,"AA",1000);
        Product product2 = new Product(102,"BB",200);
        Product product3 = new Product(103,"CC",3000);
        Product product4 = new Product(104,"DD",400);
        Product product5 = new Product(105,"EE",500);

        TreeSet<Product> productSet = new TreeSet<Product>();

    }
}
