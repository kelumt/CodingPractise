/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Principles.version3;

/**
 *
 * @author kelumt
 */
public class CourseSheetPrintService {
    
    /**
     *
     * @param student
     */
    public static void printCourseSheet(Student student){
        
        System.out.println("------ Course Sheet -------");
        System.out.println("Name = " + student.getFirstName() + " " + student.getLastName());
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Name" + " " + "Marks" + " " + "Grade");
        
        
        for(Course course : student.getCourseList()){
            System.out.println(course.getDescription() + " " + course.getMarks() + " " + course.getGrade());
        }
        
        System.out.println("--------------------------------");
    }
    
}
