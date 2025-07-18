/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.looping;

/**
 *
 * @author Christine Rio
 */
public class ForLoop {

    public static void main(String[] args) {

        /* For Loop -> useful for tasks that require repetition
                    -> best to use for fixed no. of iteration.
        
            SYNTAX
            for(initialization; condition; increment/decrement){    
             //statement or code to be executed    
            }  
        */
        
        // Write your name 5 times.
        System.out.println("Write your name 5 times.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ": Christine");
        }
        
        // Print numbers from 5-15.
        System.out.println("\nPrint numbers from 5-15.");
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
        
        
        
        
        
    }
    
    // NOTES:
    // best practice to always start with 0 unless may sinabi where to start
    // standard yung sa loob ng for i-declare and i-initialize
}

    
