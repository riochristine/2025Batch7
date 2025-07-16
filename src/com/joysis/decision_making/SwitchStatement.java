/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;

/**
 *
 * @author Christine Rio
 */
public class SwitchStatement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month: ");
        
        String month = sc.nextLine();
        
        // syntax
        // condition or expression ang nilalagay sa case
        // string to string, int to int
        switch (month) {
            case "January":
                System.out.println("Hot Dry Season");
                break;
            case "February":
                System.out.println("Cold Season");
                break;
            case "March":
                System.out.println("Winter Season");
                break;
            default:
                System.out.println("Invalid Input.");
        }
        
        /*
        Pwede: byte, short, int, String, chart, enum
        Bawal: float, double, long, boolean
        */
    }
}
