package com.codegnan.collegebuspassmanagement.entity;

public class BusPass {
    private final int id;
    private final int studentId;
    private final int year;
    private final int month;
    private final String route;
    private PassStatus status;

    public BusPass(int id, int studentId, int year, int month, String route, PassStatus status) {
        this.id = id;
        this.studentId = studentId;
        this.year = year;
        this.month = month;
        this.route = route;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public String getRoute() {
        return route;
    }
    public PassStatus getStatus() {
        return status;
    }

    public void approve(){
        if(status != PassStatus.PENDING){
            throw new IllegalStateException("Only a pending pass can be approved.");
        }
        status = PassStatus.APPROVED;
    }

    public void cancel(){
        if(status != PassStatus.PENDING && status != PassStatus.APPROVED){
            throw new IllegalStateException("This pass cannot be canceled again.");
        }
        status = PassStatus.CANCELLED;
    }

    // USED TO STORE THE PREVIOUS STATUS IF SAVING TO THE FILE FAILS
    public void restoreStatus(PassStatus oldStatus){
        this.status = oldStatus;
    }

    @Override
    public String toString(){
        return String.format("Pass ID: %d | Student ID: %d | %d-%02d | Route: %s | Status: %s",
                              id,studentId, year,month,route,status);
    }
}
