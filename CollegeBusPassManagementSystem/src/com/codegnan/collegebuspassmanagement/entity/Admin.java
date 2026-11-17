package com.codegnan.collegebuspassmanagement.entity;

public class Admin extends User{
    public Admin(){
        super(0,"Administrator");
    }

    @Override
    public void showProfile(){
        System.out.println("Admin ID:"+getId()+" | Name:"+getName());
    }

}
