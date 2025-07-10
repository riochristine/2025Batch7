package com.joysis.activities;

public class Activity2_Rio_UnaryOperator {
    
    public static void main(String[] args) {
        
        int stocks = 0;
        boolean isOutOfStock = false;
        
        System.out.println("Stocks: " + stocks);
        // int stocksIncrease = 
        // stocks++;
       
        // from 0 stocks
        System.out.println("Stocks available: " + ++stocks);
        
//        int stocksDecreased = stocks--;
//        stocksDecreased = stocks--;

        // from stocks increased by 1 
        System.out.println("Stocks left: " + --stocks);
        // stocks--;
        
        if (!isOutOfStock) {
            System.out.println("No more stocks!");
        }
        
    }
}
