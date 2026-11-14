package com.codegnan.app.javapp14.entity;

//public record Product(int id, String name, double price) implements Comparable<Product> {
//    @Override
//    public int compareTo(Product o){
//        Product currrentProduct = this;
//        Product anotherProduct = o;
//        if(currrentProduct.price > anotherProduct.price){
//            return 1;
//        }else if(currrentProduct.price < anotherProduct.price){
//            return  -1;
//        }
//        return 0;
//    }
//}

public record Product(int id, String name , double price) {
}
