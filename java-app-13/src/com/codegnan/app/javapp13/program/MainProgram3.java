package com.codegnan.app.javapp13.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainProgram3 {
    public static void main(String[] args) {
        // INPUT SOURCE
        File fileToRead = new File("C:\\Users\\tharu\\Downloads\\README.md");

        // CREATE A STREAM TO CONNECT WITH INPUT SOURCE
        try (FileReader fileReader = new FileReader(fileToRead)) {
            // READ FROM INPUT SOURCE
            int ascii = 0;
            do {
                ascii = fileReader.read();
                if (ascii != -1) {
                    char ch = (char) ascii;

                    System.out.print(ch);
                }
            } while (ascii != -1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}