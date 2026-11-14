package com.codegnan.app.javapp13.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileService {
    public String readContentsFromFile(String fileName) {
        String fileContent = "";

        File fileToRead = new File(fileName);

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(fileToRead);

            int ascii = 0;
            do {
                ascii = inputStream.read();
                if (ascii!= -1) {
                    char ch = (char) ascii;

                    fileContent += ch;
                }
            } while(ascii!= -1);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


        return fileContent;
    }
}