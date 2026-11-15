package com.codegnan.app.javaapp15.program;

import com.codegnan.app.javaapp15.entity.Product;

import java.io.*;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {

        File productDataFile = new File("D:\\Intelij-JFS-59\\product-data.ser");

        try(FileInputStream inputStream = new FileInputStream(productDataFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)){

            // DE-SERIALIZATION --> is the process of retrieving an object from a persistent(permanent) storage
            // and load in the memory(JVM).

             try {
                Product product = (Product) objectInputStream.readObject();

                int productId = product.getId();
                String name = product.getName();
                double price = product.getPrice();

                out.println("Product ID: "+productId);
                out.println("Name: "+name);
                out.println("Price :"+price);
             }catch (ClassNotFoundException classNotFoundException){
                 classNotFoundException.printStackTrace();
             }

             out.println("DONE");
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
