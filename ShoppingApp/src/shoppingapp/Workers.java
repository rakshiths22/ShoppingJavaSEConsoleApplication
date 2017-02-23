/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingapp;

/**
 *
 * @author joci
 */
public class Workers {
    
    private String name;
    private double salary;
    private double moneyperHour;
    private double workingHours;
    private String email;
    
    

    public Workers() {
    }

    public Workers(String name, double workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getMoneyperHour() {
        return moneyperHour;
    }

    public void setMoneyperHour(double moneyperHour) {
        this.moneyperHour = moneyperHour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
    
    
}
