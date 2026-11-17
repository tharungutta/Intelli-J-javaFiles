package com.interview.mock.practice2.grandexam59.Collection;

public class Student {
    private int roolNumber;
    private String name;
    private String department;
    private double score;

    public Student(int roolNumber, String name, String department, double score) {
        this.roolNumber = roolNumber;
        this.name = name;
        this.department = department;
        this.score = score;
    }
    public int getRoolNumber(){
        return roolNumber;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getScore(){
        return score;
    }
    public void display(){
        System.out.printf("%-8d %-15s %-15s %.2f%n",roolNumber,name,department,score);
    }

}
