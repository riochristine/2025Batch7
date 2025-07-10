/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.activities;

import java.util.Scanner;

/**
 *
 * @author Christine Rio
 */
public class Activity2_Rio_RelationalOperator {
    
    public static void main(String[] args) {
        System.out.println("Relational Operator <,>, <=, >=, == ,!=\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        
//        if (a <= b) {
//            System.out.println(a + " is less than or equal to " + b);
//        } else if 
//          if (a <= b) {
//              if (a < b) {
//                  System.out.println(a + " is less than " + b + ".");
//              } else {
//                  System.out.println(a + " is less than or equal to " + b + ".");
//              }
//          } else {
//              System.out.println(a + " is greater than " + b + ".");
//          }
          if (a < b) {
              System.out.println(a + " is less than " + b + ".");
          } else if (a > b) {
              System.out.println(a + " is greater than " + b + ".");
          } else {
              System.out.println(a + " is equal to " + b + ".");
          }
    }
    
}
