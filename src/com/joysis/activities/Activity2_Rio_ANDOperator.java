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
public class Activity2_Rio_ANDOperator {
    
    public static void main(String[] args) {
        
        System.out.println("AND OR Operator && ||");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How old are you?: ");
        int age = input.nextInt();
        
        System.out.println("Do you live in Quezon City? (Y/N): ");
        char QCitizen = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input
        
        if (age >= 18 && QCitizen == 'Y') {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        System.out.println("\n");
        
        System.out.println("Enter your username: ");
        String username = input.next().trim();
        
        System.out.println("Enter your pin: ");
        int pin = input.nextInt();
        
        if (username.equals("izxtn") && pin == 123) {
            System.out.println("Login successful.");
        } else if (username.equals("izxtn") || pin == 123) {
            System.out.println("username or pin is incorrect.");
        } else {
            System.out.println("username cannot be found.");
        }
        
        // learnings
        /*
        1. .toUpperCase -> to handle lowercase inputs
        2. .equals() -> to compare contents 
        3. 
        
        */
    }
}
