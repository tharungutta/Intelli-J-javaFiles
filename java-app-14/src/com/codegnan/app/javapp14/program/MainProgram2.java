package com.codegnan.app.javapp14.program;

import com.codegnan.app.javapp14.entity.NameComparator;
import com.codegnan.app.javapp14.entity.PriceComparator;
import com.codegnan.app.javapp14.entity.Product;

import java.util.*;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {
        Product product1 = new Product(104,"CC",1000);
        Product product2 = new Product(102,"BB",200);
        Product product3 = new Product(103,"AA",3000);
        Product product4 = new Product(101,"DD",400);
        Product product5 = new Product(105,"EE",500);

       // ArrayList<Product> products = new ArrayList<>();
       // HashSet<Product> products = new HashSet<>();
       // TreeSet<Product> products = new TreeSet<>();
//        TreeSet<Product> products = new TreeSet<>(new PriceComparator());
        TreeSet<Product> products = new TreeSet<>(new NameComparator());

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        out.println(products);

        ArrayList<Product> products1 = new ArrayList<>();
        products1.add(product1);
        products1.add(product2);
        products1.add(product3);
        products1.add(product4);
        products1.add(product5);
        Collections.sort(products1, Comparator.comparing(Product::name));
        out.println(products1);
        Collections.sort(products1, Comparator.comparing(Product::price));
        out.println(products1);
        Collections.sort(products1, Comparator.comparingInt(Product::id));
        out.println(products1);


    }
}
