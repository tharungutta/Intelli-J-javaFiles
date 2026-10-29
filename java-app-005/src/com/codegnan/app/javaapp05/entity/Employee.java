package com.codegnan.app.javaapp05.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import static java.lang.System.out;

public class Employee {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
    

       try (var fileReader = new FileReader(new File("src/employee-data.txt"))){
           var bufferedReader = new BufferedReader(fileReader);

           String data = null;
                  do {
                      data =  bufferedReader.readLine();
                      if(data != null){
                        String[] values=   data.split("@");
                         out.println("Employee ID: "+ values[0]);
                          out.println("Name: "+ values[1]);
                          out.println();
                      }
                  }while (data != null);
       }catch (IOException ioException){
           ioException.printStackTrace();
       }

    }
}