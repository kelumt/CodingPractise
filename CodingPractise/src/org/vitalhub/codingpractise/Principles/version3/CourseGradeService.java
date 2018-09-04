/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Principles.version3;

import java.util.List;

/**
 *
 * @author kelumt
 */
public class CourseGradeService {
    
    /**
     *
     * @param courseList
     * @return
     */
    public static float calculateCourseAvarage(List<Course> courseList){
        float totalMarks = 0.0f;
        
        for(Course course : courseList){
            totalMarks += course.getMarks();
        }
        
        return AverageCalulatorService.calculateAverage(totalMarks, courseList.size());
    } 
    
}
