/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;

/*  TO DO: Optimize, DRY Principle

            Load Registration
            
            1. Text Only
            2. Call Only
            3. Call N Text
            4. Data Only 
 */
public class LoadRegistrationSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("============================");
            System.out.println("  Load Registration System  ");
            System.out.println("============================");

            System.out.println("  [1] Text Only");
            System.out.println("  [2] Call Only");
            System.out.println("  [3] Call N Text");
            System.out.println("  [4] Data Only");
            System.out.println("  [5] Exit");
            System.out.print/*ln*/("Select your choice: "); // remove ln if ayaw sa new line yung input
            int choice = input.nextInt();

            // nested if statement
            if (choice == 1) { // [1] Text Only
                System.out.println("\nText Only Promos");

                System.out.println("  [1] 1 Day, P10 ");
                System.out.println("  [2] 2 Days, P20 ");
                System.out.println("  [3] 5 Days, P50 ");
                System.out.print("Enter your choice: ");

                choice = input.nextInt();

                if (choice == 1) { // [1] 1 Day, P10
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli text for P10 valid for 1 day.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                } else if (choice == 2) { // [2] 2 Days, P20
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli text for P20 valid for 2 days.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                } else if (choice == 3) { // [3] 5 Days, P50 
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli text for P50 valid for 5 days.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                }
            } else if (choice == 2) { // [2] Call Only
                System.out.println("\nCall Only");

                System.out.println("  [1] 30 mins, P10");
                System.out.println("  [2] 1 Hr 30 mins., P30");
                System.out.println("  [3] 1 Day, P50");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                if (choice == 1) { // [1] 30 mins, P10
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli call to all networks for 30 mins.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                } else if (choice == 2) { // [2] 1 Hr 30 mins., P30
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli call to all networks for 1hr and 30 mins.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                } else if (choice == 3) { // [3] 1 Day, P50
                    System.out.println("  [1] Subscribe");
                    System.out.println("  [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Congratulations! You have successfully"
                                + " subscribed to unli call to all networks for 1 Day.");
                        System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                        char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                        if (ans == 'Y') {
                            System.out.println("\n");
                            continue;
                        } else {
                            System.out.println("Thank you!");
                            running = false;
                        }
                    } else {
                        System.out.println("Thank you!");
                        running = false;
                    }
                }
            } else if (choice == 3) { // call n text promo
                System.out.println("\nCall N Text");

                System.out.println("  [1] 30 mins + 1 Day Unli Text, P20");
                System.out.println("  [2] 1 Hr 30 mins. + 2 Days Unli Text, P50");
                System.out.println("  [3] 1 Day + 5 Days Unli Text, P100");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) { // switch case for promos
                    case 1:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        int subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 30 mins. unli call to all networks + 1 Day unli text.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                        break;
                    case 2:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 1hr 30 mins. unli call to all networks + 2 Days unli text.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                        break;
                    case 3:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 1 Day unli call to all networks + 5 Days unli text.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                }
            } else if (choice == 4) {
                System.out.println("\nData Only");

                System.out.println("  [1] 1 GB valid for 1 Day, P20");
                System.out.println("  [2] 3 GB valid for 3 Days, P50");
                System.out.println("  [3] 7 GB valid for 7 Days, P99");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        int subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 1 GB of Data valid for 1 Day.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                        break;
                    case 2:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 3 GB of Data valid for 3 Days.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                        break;
                    case 3:
                        System.out.println("  [1] Subscribe");
                        System.out.println("  [2] Exit");
                        System.out.print("Enter your choice: ");
                        subscribeChoice = input.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("Congratulations! You have successfully "
                                        + "subscribed to 7 GB of Data valid for 7 Days.");
                                System.out.print("\nDo you wish to make another transaction? [Y/N]: ");
                                char ans = Character.toUpperCase(input.next().charAt(0)); // handle lowercase input

                                if (ans == 'Y') {
                                    System.out.println("\n");
                                    continue;
                                } else {
                                    System.out.println("Thank you!");
                                    running = false;
                                }
                                break;
                            case 2:
                                System.out.println("Thank you.");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input.");
                        }
                }
            } else {
                System.out.println("Exiting...");
                running = false;
            }
        }
    }
}
