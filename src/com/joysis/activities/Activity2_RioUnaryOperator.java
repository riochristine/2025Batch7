package com.joysis.activities;

public class Activity2_RioUnaryOperator {
    
    public static void main(String[] args) {
        
        int stocks = 1;
        boolean isOutOfStock = false;
        
        System.out.println("Stocks: " + stocks);
        // int stocksIncrease = 
        // stocks++;
        System.out.println("Stocks increased: " + ++stocks);
        
        int stocksDecreased = stocks--;
        stocksDecreased = stocks--;
        System.out.println("Stocks decreased: " + stocks);
        // stocks--;
        
        if (!isOutOfStock) {
            System.out.println("No more stocks!");
        }
        
    }
}
