/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Principles.version1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author kelumt
 */
public class Student {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    
    private List<Course> courseList = new ArrayList<>();

    public Student(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    
    public float calculateCourseAvarage(){
        float totalMarks = 0.0f;
        
        for(Course course : this.courseList){
            totalMarks += course.getMarks();
        }
        
        float average = totalMarks/courseList.size();
        return average;
    }
    
    public void printCourseSheet(){
        
        System.out.println("------ Course Sheet -------");
        System.out.println("Name = " + this.getFirstName() + " " + this.getLastName());
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Name" + " " + "Marks" + " " + "Grade");
        
        
        for(Course course : this.courseList){
            System.out.println(course.getDescription() + " " + course.getMarks() + " " + course.getGrade());
        }
        
        System.out.println("--------------------------------");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", courseList=" + courseList + '}';
    }
    
    
    
}
