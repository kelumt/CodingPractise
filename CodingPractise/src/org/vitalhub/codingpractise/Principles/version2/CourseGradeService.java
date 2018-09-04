/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Principles.version2;

import java.util.List;

/**
 *
 * @author kelumt
 */
public class CourseGradeService {
    
    public static float calculateCourseAvarage(List<Course> courseList){
        float totalMarks = 0.0f;
        
        for(Course course : courseList){
            totalMarks += course.getMarks();
        }
        
        float average = totalMarks/courseList.size();
        return average;
    } 
    
}
