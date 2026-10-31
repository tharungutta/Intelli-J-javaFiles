package com.codegnan.app.javaapp07.program;

import com.codegnan.app.javaapp07.operation.EmployeeOperations;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {

      String str = "\u0065\u0066\u0067\u0068\u0069";
      out.println(str);
        var employeeOpeartions = new EmployeeOperations();

        var employeeName = "Neha sharma";
        var employeeUsername = employeeOpeartions.generateUsername(employeeName);
        boolean isEmployeeAdded = employeeOpeartions.addEmployee(employeeName,employeeUsername );
        if(isEmployeeAdded){
            out.println("Employeee 1 Added");
        }

        employeeName = "Ankit Verma";
        employeeUsername = employeeOpeartions.generateUsername(employeeName);
         isEmployeeAdded = employeeOpeartions.addEmployee(employeeName,employeeUsername );
        if(isEmployeeAdded){
            out.println("Employeee 2 Added");
        }

        employeeName = "Chetan Singh Chauan";
         employeeUsername = employeeOpeartions.generateUsername(employeeName);
         isEmployeeAdded = employeeOpeartions.addEmployee(employeeName,employeeUsername );
        if(isEmployeeAdded){
            out.println("Employeee 3 Added");
        }
        out.println();

      /*  Map<String,String> usernames = employeeOpeartions.getUsernames();
        Set<Map.Entry<String,String>> userNamentries = usernames.entrySet();

        for(Map.Entry<String,String> entry : userNamentries){
            String key = entry.getKey();
            String value = entry.getValue();

            out.println("Employee Name: "+key);
            out.println("UserName: "+value);
            out.println();

        }*/

        Map<String,String> usernames = employeeOpeartions.getUsernames();
        Set<String> employeeNames = usernames.keySet();
        for(String empName: employeeNames){
            out.println(empName);
        }

//        var username1 = employeeOpeartions.generateUsername("Rahul Sharma");
//        var username2 = employeeOpeartions.generateUsername("  Rahul Sharma  ");
//        var username3 = employeeOpeartions.generateUsername( "PRIYA KUMARI");
//        var username4 = employeeOpeartions.generateUsername("  Amit Kumar Singh ");
//        var username5 = employeeOpeartions.generateUsername( "John");
//
//        out.println("Username generated for employee1:  is "+username1);
//        out.println("Username generated for employee2:  is "+username2);
//        out.println("Username generated for employee3:  is "+username3);
//        out.println("Username generated for employee4:  is "+username4);
//        out.println("Username generated for employee5:  is "+username5);

    }
}
