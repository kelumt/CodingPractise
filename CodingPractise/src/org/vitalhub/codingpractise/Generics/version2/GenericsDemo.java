/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vitalhub.codingpractise.Generics.version2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelumt
 */
public class GenericsDemo {
    
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList();
        
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        //integerList.add("6");
        
        for(int i=0; i<integerList.size(); i++){
            int value = (Integer)integerList.get(i);
            
            System.out.println(value);
        }
    }
}
