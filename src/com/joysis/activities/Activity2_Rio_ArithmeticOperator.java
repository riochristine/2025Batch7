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
public class Activity2_Rio_ArithmeticOperator {
    public static void main(String[] args) {
        
        System.out.println("Arithmetic Operator +, -, *, / ,%\n");
        
//        int num1 = 43;
//        int num2 = 65;
//        int sum = num1 + num2;
//        
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        
        
//        int num1, num2;
//        int sum, diff, product, quotient;
//        char operator = ;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Simple Calculator\n");
        
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Choose an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        
        int result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        
        System.out.println(" = " + result);
        input.close();
        
//        System.out.println("MENU:");
//        System.out.println("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide\n");
//        
//        System.out.println("Select what you want to do: ");
        
//        int choice = sc.nextInt();
////        System.out.println(choice);
//        // int num1 = sc.nextInt();
//        
//        
//        if (choice == 1) {
//            System.out.println("Enter first number: ");
//            num1 = sc.nextInt();
//            System.out.println("Enter second number: ");
//            num2 = sc.nextInt();
//            sum = num1 + num2;
//            System.out.println(num1 + " + " + num2 + " = " + sum);
//        } else {
//            System.out.println("what");
//        }
    }
//        switch (choice) {
//              case 1:
//                  
//        }
    
    
    
    
}
