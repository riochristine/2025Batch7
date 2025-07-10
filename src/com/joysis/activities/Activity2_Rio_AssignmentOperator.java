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
public class Activity2_Rio_AssignmentOperator {
    
    public static void main(String[] args) {
        
        System.out.println("Assignment Operator =, +=, -=, *=, /=, %=\n");
        
        Scanner sc = new Scanner(System.in);
        double balance = 1583.71;
        
        // System.out.println("Balance: 1583.71");
        System.out.println("[1] Inquire Balance\n[2] Withdraw Cash\n[3] Deposit");
        
        System.out.println("Select what you want to do: ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.println("Enter amount you wish to withdraw: ");
                double withdraw = sc.nextDouble();
                System.out.println("Your transaction is being processed...");
                
                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println("Something went wrong.");
                }
                
                balance -= withdraw;
                System.out.println("Available balance: " + balance);
                break;
            case 3: 
                System.out.println("Enter amount you wish to deposit.");
                double deposit = sc.nextDouble();
                balance += deposit;
                
                System.out.println("Your new available balance is: " + balance);
        }
    }
    
}
