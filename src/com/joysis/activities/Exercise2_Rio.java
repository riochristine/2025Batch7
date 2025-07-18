/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.activities;

/**
 *
 * @author Christine Rio
 */
public class Exercise2_Rio {
    
    public static void main(String[] args) {
        
    // Exercise 2: Print the first five positive even numbers using for loop.
        
        for (int i = 2; i <= 10; i++) { // first five would be 2, 4, 6, 8, 10
            if (i % 2 == 0) { // to check if even
                System.out.println(i); // print 
            }
        }
        
    }
}
