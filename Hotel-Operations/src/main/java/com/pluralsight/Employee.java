package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Punch in method
    public void punchIn(double time){
        this.punchInTime = time;
        System.out.println(name +" punched in at "+ time+ punchInTime);
    }

    // Punch out method
    public void punchOut(double time){
        if (time > this.punchInTime){
            double worked = time - this.punchInTime;
            hoursWorked = this.hoursWorked + worked;
            System.out.println(this.name + " punched out at "+ time+ " - "+ worked+ " hours added.");
        }else{
            System.out.println("Punch out time must be after punch-in time.");
        }
    }

    // method to return regular hours
    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    //method to return over time hours
    public double getOverTimeHours() {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }


    // Method to calculate total pay
    public double getTotalPay() {
        double basePay = getRegularHours() * this.payRate;
        double overTimePay = getOverTimeHours() * (1.5 * this.payRate);
        return basePay + overTimePay;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
