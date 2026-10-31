package com.codegnan.app.javaapp07.operation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.out;

public class EmployeeOperations {
   // private HashMap<String, String> usernames = new HashMap<>();
   // private LinkedHashMap<String, String> usernames = new LinkedHashMap<>();
   private TreeMap<String, String> usernames = new TreeMap<>();

    public Map<String,String> getUsernames(){
        return usernames;
    }

    public boolean addEmployee(String name, String username){
        boolean isAdded = false;

        String value  = usernames.put(name,username);
        if(value == null){
            isAdded = true;
        }
        return isAdded;
    }

   public String generateUsername(String name){
      String username = name.trim().toLowerCase().replace(" ","_");

      return username;
  }

}
