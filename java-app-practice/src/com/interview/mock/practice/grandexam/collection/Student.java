package com.interview.mock.practice.grandexam.collection;

public class Student {
    private int rollNumber;
    private String name;
    private String department;
    private double score;

    public Student(int rollNumber, String name, String department, double score) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.score = score;
    }
    public int getRollNumber(){
        return rollNumber;
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
        System.out.printf("%-8d %-15s %-15s %.2f\n", rollNumber, name, department , score);
    }
}
