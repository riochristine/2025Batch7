/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.looping;

import java.util.Scanner;

/**
 *
 * @author Christine Rio
 */
public class WhileLoop {

    public static void main(String[] args) {

        /* While Loop
            -> recommended if iteration is not fixed
            ->
        
            SYNTAX
            while (condition){      
            //code to be executed     
            Increment / decrement statement    
            }      
         */
        // Write your name 5 times for-loop.
        System.out.println("Foor Loop: Write your name 5 times.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ": Christine");
        }

        // Write your name 5 times while-loop.
        System.out.println("\nWhile Loop: Write your name 5 times.");
        int i = 0;
        while (i < 5) {
            System.out.println(i + 1 + ": Christine");
            i++;
        }

        // Do-While Loop
        System.out.println("\nDo While Loop");
        int j = 0;
        do {
            System.out.println(j + 1 + ": Christine");
            j++;
        } while (j < 5);

        // Login System
        Scanner sc = new Scanner(System.in);

        String username = "christine";
        String password = "christine123";

//        System.out.print("Enter your username: ");
//        String inputtedUsername = sc.nextLine();
//        
//        System.out.print("Enter your password: ");
//        String inputtedPassword = sc.nextLine();
//        
//        if (inputtedUsername.equals(username) && inputtedPassword.equals(password)) {
//            System.out.println("Logged In Successfully!");
//        } else {
//            System.out.println("Invalid Credentials."); // should loop
//        }

        boolean running = true;
        while (running) {
            System.out.print("\nEnter your username: ");
            String inputtedUsername = sc.nextLine();

            System.out.print("Enter your password: ");
            String inputtedPassword = sc.nextLine();

            if (inputtedUsername.equals(username) && inputtedPassword.equals(password)) {
                System.out.println("Logged In Successfully!");
                running = false;
            } else {
                System.out.println("Invalid Credentials.\n"); // should loop
            }
        }

        // NOTES:
        // sa lahat optional lang ang incrementation pero depende pa rin sa gagawin if need or not
    }
}
