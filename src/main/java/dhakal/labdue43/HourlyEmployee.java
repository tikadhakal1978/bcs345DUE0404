/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.labdue43;

/**
 *
 * @author tikad
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    
    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber,double hours, double wage){
        
        
        super (firstName, lastName, socialSecurityNumber);
        
        this.hours = hours;
        this.wage = wage;
    }
    
    public void setHours(double hours){
        if (hours >= 0 && hours <=168){
            this.hours = hours;
        } 
    }
    
    public double getHours(){
        
        return this.hours;
    }
    
    public void setWage (double wage){
        if (wage >=0){
            this.wage = wage;
        }
    }
    
    public double getWage(){
        
        return this.wage;
    }
    
    public double earnings (){
        return hours * wage;
    }
    
    @Override 
    public String toString(){
        return "First Name : "  + super.getFirstName() + "Last Name: "  +  super.getLastName() +  
               "Social Security Number: " + super.getSocialSecurityNumber() + "hours: " + hours + "wage: " + wage;
    }
}
    

