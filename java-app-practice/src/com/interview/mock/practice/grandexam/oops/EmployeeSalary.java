package com.interview.mock.practice.grandexam.oops;

import java.util.ArrayList;

public class EmployeeSalary {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
            // two developer objects
           employee.add(new Developer(1,"Tharun", 80000,5000));
           employee.add(new Developer(2,"Ramu",50000,4000));
           // two salesExecutive objects
          employee.add(new SalesExecutive(3,"Boob", 70000,100000,5));
          employee.add(new SalesExecutive(4, "karim",40000, 150000, 8));
        System.out.println("Employee Salary report");
        System.out.printf("%-8s %-15s %-15s %-15s%n", "ID", "NAME","SALARY","FINAL SAL");
        System.out.println("-----------------------------------------------------------");
        Employee highestPaid = employee.get(0);
       for(Employee emp : employee){
           emp.displaySalary();
           if(emp.calculateSalary()> highestPaid.calculateSalary()){
               highestPaid = emp;
           }
       }
        System.out.println("Highest paid employeee: ");
        System.out.println("EMPLOYEE ID:"+highestPaid.id);
        System.out.println("Employee NAme:"+highestPaid.name);
        System.out.printf("%.2f%n",highestPaid.calculateSalary());
    }
}
