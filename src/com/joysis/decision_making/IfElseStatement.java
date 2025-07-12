/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;


public class IfElseStatement {
    
    public static void main(String[] args) {
        
        /*
        decision making -> which statement to execute and when
        2 TYPES
        1. if statement
        2. switch statement
        */
        
        /*
        1. if statement
        4 TYPES
            1. simple if -> most basic, executes when condition is true
            2. if else -> else block is executed when if block is evaluated as false
            3. if else if ladder
            4. nested if
        */
        
       
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("Even"); // simple if
        } else {
            System.out.println("Odd"); // if else
        }
        
        float temp = 0.0f;
        
        if (temp >= 37.5) {
            System.out.println("Fever");
            System.out.println("Hello"); // will no longer continue to be executed once evaluated to false
            System.out.println("Java");
        } else {
            System.out.println("Normal Temp");
        }
       
    }
}
