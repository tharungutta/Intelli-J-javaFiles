package com.interview.mock.practice.grandexam.oops;

public class SalesExecutive extends Employee {
    private double monthlySales;
    private double commisionRate;
    public SalesExecutive(int id, String name, double baseSalary, double monthlySales, double commisionRate){
        super(id, name, baseSalary);
        this.monthlySales = monthlySales;
        this.commisionRate = commisionRate;
    }
    @Override
    public double calculateSalary(){
        double commission = monthlySales * commisionRate/100;
        return  baseSalary +commission;
    }
}
