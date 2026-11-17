package com.codegnan.collegebuspassmanagement.entity;

public class Student extends User{
    private final String department;

    public Student(int id, String name, String department){
        super(id,name);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    @Override
    public void showProfile(){
        System.out.printf("ID: %d | Name: %s |Department: %s%n", getId(),getName(),getDepartment());
    }
}
