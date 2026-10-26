package com.codegnan.app.javaapp01.program;

import com.codegnan.app.javaapp01.entity.Product;

public class MainProgram1 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Maggi Atta Noodles", 25);
        Product product2 = new Product(2, "Maggi Vegetable Noodles", 15);
        //Product product2 = new Product(1, "Maggi Atta Noodles", 25);

        boolean areSame = product1.equals(product2);
        System.out.println(areSame);

        /*Product product1 = new Product(1, "Maggi Atta Noodles", 25);
        Product product2 = new Product(2, "Maggi Vegetable Noodles", 15);
        Product product3 = new Product(3, "Maggi Chicken Noodles", 35);
        Product product4 = new Product(4, "Real Apple Juice", 175);
        Product product5 = new Product(5, "Real Orange Juice", 95);
        Product product6 = new Product(6, "Real Guava Juice", 125);

        //ArrayList<Product> products = new ArrayList<>();
        //HashSet<Product> products = new HashSet<>();
        //LinkedHashSet<Product> products = new LinkedHashSet<>();
        TreeSet<Product> products = new TreeSet<>();
        products.add(product4);//4
        products.add(product2);//2
        products.add(product1);//1
        products.add(product3);//3
        products.add(product6);//6
        products.add(product5);//5

        //1st round
        System.out.println(product4.compareTo(product2));
        System.out.println(product4.compareTo(product1));
        System.out.println(product4.compareTo(product3));
        System.out.println(product4.compareTo(product6));
        System.out.println(product4.compareTo(product5));

        //2nd round
        System.out.println(product2.compareTo(product1));
        System.out.println(product2.compareTo(product3));
        System.out.println(product2.compareTo(product6));
        System.out.println(product2.compareTo(product5));

        //3rd round
        System.out.println(product1.compareTo(product3));
        System.out.println(product1.compareTo(product6));
        System.out.println(product1.compareTo(product5));

        //4th round
        System.out.println(product3.compareTo(product6));
        System.out.println(product3.compareTo(product5));

        //5th round
        System.out.println(product6.compareTo(product5));*/

        /*for (Product product : products) {
            System.out.println(product);
        }*/

        /*Product product = new Product();
        product.setId(1);
        product.setName("Maggi Atta Noodles");
        product.setPrice(25);*/

        //Product product = new Product(1, "Maggi Atta Noodles", 25);

        //System.out.println(product);

        /*int productId = product.getId();
        String productName = product.getName();
        double productPrice = product.getPrice();

        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);*/
    }
}
