/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.activities;

import java.util.Scanner;

/**
 *
 * @author Christine
 */

/*
    Create a program that will categorize a person's age into different groups, such as baby, child, teenager, young adult, adult, or senior.

        Age: 0 - 2 Category: Baby
        Age: 3 - 12 Category: Child
        Age: 13 - 19 Category: Teenager
        Age: 20 - 29 Category: Young Adult
        Age: 30 - 59 Category: Adult
        Age: 60 - 100 Category: Senior
*/
public class Exercise1_Rio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = 0;
        String category;
        
        // prompt for age input
        System.out.print("Enter age: ");
        age = sc.nextInt(); // read age input
        sc.nextLine();  // consume new line character
        
        if (age <= 2) {
            category = "You are a Baby.";
        } else if (age <= 12) {
            category = "You are a Child.";
        } else if (age <= 19) {
            category = "You are a Teenager.";
        } else if (age <= 29) {
            category = "You are a Young Adult.";
        } else if (age <= 59) {
            category = "You are an Adult.";
        } else {
            category = "You are a Senior.";
        }
        System.out.println(category);
        
    }
}
