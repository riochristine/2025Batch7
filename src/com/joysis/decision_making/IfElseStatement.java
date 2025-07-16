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
        
//        int number = 3;
//        if (number % 2 == 0) {
//            System.out.println("Even"); // simple if
//        } else {
//            System.out.println("Odd"); // if else
//        }
//        
//        float temp = 0.0f;
//        
//        if (temp >= 37.5) {
//            System.out.println("Fever");
//            System.out.println("Hello"); // will no longer continue to be executed once evaluated to false
//            System.out.println("Java");
//        } else {
//            System.out.println("Normal Temp");
//        }

        // voters age classification
        /* age
            14 below -> Not yet a voter
            15 - 17 -> School Election
            18 - 25 -> SK Election
            26 - 30 -> National Election
            31 and above -> International Election
         */
        
//        int age = 0;
//        if (age <= 14) {
//            System.out.println("Not yet a voter");
//        } else if (age <= 17) { // 15 -17
//            System.out.println("School Election");
//        } else if (age <= 25) { // 18 - 25
//            System.out.println("SK Election");
//        } else {
//            System.out.println("National Election");
//        }

        // reverse range + not using print repeatedly
        int age = 0;
        String result;
//        
//        if (age >= 31) {
//            result = "International Election";
//        } else if (age >= 26) {
//            result = "National Election";
//        } else if (age >= 18) {
//            result = "SK Election";
//        } else if (age >= 15) {
//            result = "School Election";
//        } else {
//            result = "Not yet a voter";
//        }
//
//        System.out.println(result);

        // validation -> handle negative inputs
        // switch statement
        // range: age 1-100
        if (age >= 1 && age <= 100) { // outer if
            if (age >= 31) { // inner if
                result = "International Election";
            } else if (age >= 26) {
                result = "National Election";
            } else if (age >= 18) {
                result = "SK Election";
            } else if (age >= 15) {
                result = "School Election";
            } else {
                result = "Not yet a voter";
            }
        } else {
            result = "Invalid age. Age must be greater than 0."; // handles negative age input
        }
        
        System.out.println("Result: " + result);
    }
}
