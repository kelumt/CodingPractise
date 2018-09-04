/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Principles.version2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelumt
 */
public class CodingPractise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student student = new Student(Long.valueOf(1), "John", "Snow");
        
        Course java = new Course(1, "Java");
        java.setMarks(95);
        java.setGrade('A');
        
        Course html = new Course(2, "Html");
        html.setMarks(65);
        html.setGrade('B');
        
        Course ios = new Course(3, "iOS");
        ios.setMarks(50);
        ios.setGrade('C');
        
        List<Course> courseList = new ArrayList<>();
        courseList.add(java);
        courseList.add(html);
        courseList.add(ios);
        
        student.setCourseList(courseList);
        
        CourseSheetPrintService.printCourseSheet(student);
        
        float averageCourseMarks = CourseGradeService.calculateCourseAvarage(courseList);
        
        System.out.println("Average = " + averageCourseMarks);
    }
    
}
