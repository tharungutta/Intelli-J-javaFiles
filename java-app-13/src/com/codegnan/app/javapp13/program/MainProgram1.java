package com.codegnan.app.javapp13.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainProgram1 {
    public static void main(String[] args) {
        // INPUT SOURCE
        File fileToRead = new File("C:\\Users\\tharu\\Downloads\\README.md");

        FileInputStream inputStream = null;

        try {
            // CREATE A STREAM TO CONNECT WITH INPUT SOURCE
            inputStream = new FileInputStream(fileToRead);

            // READ FROM INPUT SOURCE
            int ascii = 0;
            do {
                ascii = inputStream.read();
                if (ascii != -1) {
                    char ch = (char) ascii;

                    System.out.print(ch);
                }
            } while (ascii != -1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                //CHECK IF THE STREAM IS OPEN, THEN CLOSE IT.
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}