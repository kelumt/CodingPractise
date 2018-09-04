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
public class AverageCalulatorService {
    
    /**
     *
     * @param total float variable to denote the total amount to consider
     * @param numberOfItems integer variable to denote the number of items
     * @return the average value for given total value and number of items
     */
    public static float calculateAverage(float total, int numberOfItems){
        float average = total/numberOfItems;
        return average;
    }
    
}
