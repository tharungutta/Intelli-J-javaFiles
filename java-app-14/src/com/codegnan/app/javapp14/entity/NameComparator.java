package com.codegnan.app.javapp14.entity;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2){
        Product currentProduct = p1;
        Product anotherProduct = p2;
        return currentProduct.name().compareTo(anotherProduct.name());
    }
}
