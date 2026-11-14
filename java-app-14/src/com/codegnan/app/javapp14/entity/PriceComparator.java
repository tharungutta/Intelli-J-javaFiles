package com.codegnan.app.javapp14.entity;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2){
        Product currentProduct = p1;
        Product anotherProduct = p2;
        if(currentProduct.price() > anotherProduct.price()){
            return 1;
        }else if (currentProduct.price() < anotherProduct.price()){
            return -1;
        }
        return 0;
    }


}
