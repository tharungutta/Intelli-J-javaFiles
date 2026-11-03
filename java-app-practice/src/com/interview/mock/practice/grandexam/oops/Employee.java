package com.interview.mock.practice.grandexam.oops;

abstract class Employee {
    protected int id;
    protected String name;
    protected double baseSalary;
    public Employee(int id, String name, double baseSalary){
        this.id = id;
        this.name= name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();

    public void displaySalary(){
        System.out.printf(
                "%-8d %-15s %-15.2f %-15.2f%n", id, name, baseSalary, calculateSalary()
        );


    }
}
