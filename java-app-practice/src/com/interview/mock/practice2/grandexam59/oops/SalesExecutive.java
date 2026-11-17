package com.interview.mock.practice2.grandexam59.oops;

public class SalesExecutive extends Employee{
    private double monthlySales;
    private double commissionRate;
    public SalesExecutive(int id, String name ,double baseSalary,  double monthlySales, double commissionRate){
        super(id,name,baseSalary);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculateSalary(){
        double commission = monthlySales * commissionRate/100;
        return baseSalary+commission;
    }
}
