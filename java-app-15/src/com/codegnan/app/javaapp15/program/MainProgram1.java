package com.codegnan.app.javaapp15.program;

import com.codegnan.app.javaapp15.entity.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
        Product product = new Product(101, "Maggi atta noodels", 25);

        File productDataFile = new File("D:\\Intelij-JFS-59\\product-data.ser");

        try(FileOutputStream outputStream = new FileOutputStream(productDataFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){

            // SERIALIZATION --> is the process of saving an object along with its state(data-- global variables)
            // to a persistent storage such as a file or a database system.

            objectOutputStream.writeObject(product);
            
            out.println("DONE");
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
