package com.codegnan.app.javaapp01.entity;
// ENTITY / MODEL / BEAN / POJO CLASS
public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String objectInfo = "Product[";
        objectInfo += "id=" +id;
        objectInfo += "name=" +name;
        objectInfo += "price=" +price;
        objectInfo += "]";

        return objectInfo;
    }

    @Override
    public int compareTo(Product o) {
        Product currentProduct = (Product) this;
        Product otherProduct = (Product) o;

        /*if (currentProduct.getId() > otherProduct.getId()) {
            return 1;
        } else if (currentProduct.getId() < otherProduct.getId()) {
            return -1;
        }*/

        /*if (currentProduct.getPrice() > otherProduct.getPrice()) {
            return 1;
        } else if (currentProduct.getPrice() < otherProduct.getPrice()) {
            return -1;
        }*/

        if (currentProduct.getPrice() > otherProduct.getPrice()) {
            return -1;
        } else if (currentProduct.getPrice() < otherProduct.getPrice()) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        boolean areSame = false;

        // RETRIEVE CURRENT OBJECT (WHICH NEEDS TO BE COMPARED)
        Product currentProduct = (Product) this;
        // RETRIEVE OTHER OBJECT (WITH WHICH COMPARISON NEEDS TO BE DONE)
        Product otherProduct = (Product) obj;

        // RETRIEVE ALL THE VALUES FROM BOTH THE OBJECTS
        int currentProductId = currentProduct.getId();
        String currentProductName = currentProduct.getName();
        double currentProductPrice = currentProduct.getPrice();

        int otherProductId = otherProduct.getId();
        String otherProductName = otherProduct.getName();
        double otherProductPrice = otherProduct.getPrice();

        // LOGIC FOR EQUALITY CHECK
        if (currentProductId == otherProductId
                && currentProductName.equals(otherProductName)
                && currentProductPrice == otherProductPrice) {
            areSame = true;
        }

        return areSame;
    }
}
