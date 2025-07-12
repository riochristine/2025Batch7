/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;


public class IfElseIfLadder {
    
    public static void main(String[] args) {
        /*
            1 -> January
            2 -> February
            3 -> March
        */ 
        
        /* int month = 1;
        
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } /* else {
            optional
        } */
        
        // user input -> Scannner -> class na need i-import
        
        // class instantiation - > object
        // Class is a blueprint of an object
        // Classname object = new Classname ();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        
        String month = input.nextLine();
        
        if (month.equals("January") ) {
            System.out.println("Hot Dry Season");
        } else if (month == "April") {
            System.out.println("Cold Season");
        } else {
            System.out.println("Winter Season");
        }
        
        /* == vs .equals()
        == -> values only (integer values)
        .equals -> values nd type (compare string values)
        
        
        String month2 = "January"; // string literal
        String month3 = new String("January"); // string object
        System.out.println(month2 == month3);
        // false output
        */
    }
}
