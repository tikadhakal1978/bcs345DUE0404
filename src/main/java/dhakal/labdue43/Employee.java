/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.labdue43;

/**
 *
 * @author tikad
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee (String firstName, String lastName, String socialSecurityNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;  
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getSocialSecurityNumber (){
        return this.socialSecurityNumber;
    }
    
    @Override
    public String toString (){
        return "First Name: " + this.firstName + "ListName: " + this.lastName + "SocialSecurityNumber: " + this.socialSecurityNumber;
    }
}
