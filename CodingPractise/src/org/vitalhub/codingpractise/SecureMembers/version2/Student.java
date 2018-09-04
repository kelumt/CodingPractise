/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.SecureMembers.version2;

import java.util.Date;

/**
 *
 * @author kelumt
 */
public class Student {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First Name is invalid");
        }
        
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last Name is invalid");
        }
        
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth Date is invalid");
        }
        
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + '}';
    }
    
    
    
    
        
}
