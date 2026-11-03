package com.interview.mock.practice.grandexam.oops;

import com.interview.mock.practice.grandexam.oops.Employee;

public class Developer extends Employee {
    private double projectAlloance;
    public Developer(int id, String name, double baseSalary, double projectAlloance){
        super(id, name, baseSalary);
        this.projectAlloance = projectAlloance;
    }
    @Override
    public double calculateSalary(){
        return  baseSalary+projectAlloance;
    }

}
