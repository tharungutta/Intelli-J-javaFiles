package com.codegnan.app.javaapp04.operation;

import com.codegnan.app.javaapp04.entity.Product;

import java.util.HashSet;
import java.util.Iterator;

public class ProductOperations {
    private final HashSet<Product> products = new HashSet<>();

    public ProductOperations() {
        var product1 = new Product(1, "Tharun",100);
        var product2 = new Product(2, "Teja",11);
        var product3 = new Product(3, "Bhuvi",122);
        var product4 = new Product(4, "Revanth",67);
        var product5 = new Product(5, "Yesh",101);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }

    public boolean updateProductPrice(int productId, double newPrice) {
        Product product = findProductById(productId);

        if (product == null) {
            return false;
        }

        products.remove(product);
        products.add(new Product(product.id(), product.name(), newPrice));
        return true;
    }

    public boolean deleteProduct(int productId) {
        boolean isDeleted = false;
        Product foundProduct = null;
        for(Product product : products) {
            if(product.id() == productId) {
                foundProduct = product;
                break;
            }
        }
        if(foundProduct != null) {
            isDeleted = products.remove(foundProduct);
        }
        return isDeleted;
    }

    // Add the product to the inventory
    public boolean addProduct(int productId , String name, double price) {
        var isAdded = false;
        isAdded = products.add(new Product(1, "mobile", 1000));
        return isAdded;
    }

    // Display all the products to the inventory
    public void displayProducts() {
        for(Product product : products) {
            System.out.println(product);
        }
    }


    public HashSet<Product> getProducts(){
        return products;
    }

    public Product findProductById(int productId) {
        for(Product product: products) {
            if(product.id() == productId) {
                return product;
            }
        }
        return null;
    }

    public Product findProductByName(String productName) {
        for(Product product: products) {
            if(product.name().equals(productName)) {
                return product;
            }
        }

        return null;
    }

}
