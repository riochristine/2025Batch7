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
public class Activity2_Rio_TernaryOperator {
    public static void main(String[] args) {
        
        System.out.println("Ternary Operator (), ?, :\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc.nextInt();
        
        String remarks = (score >= 38)? "Passed" : "Failed";
        System.out.println("You got " + score + "/50." + " You " + remarks + " the exam.");
    }
}

/*
    variable = (condition) ? expressionTrue :  expressionFalse;
*/
