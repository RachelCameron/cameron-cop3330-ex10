/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        double price1 = input.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        double quantity1 = input.nextDouble();
        System.out.println("Enter the price of item 2:");
        double price2 = input.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        double quantity2 = input.nextDouble();
        System.out.println("Enter the price of item 3:");
        double price3 = input.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        double quantity3 = input.nextDouble();
        double subtotal = price1*quantity1 + price2*quantity2 + price3*quantity3;
        double tax = (subtotal*.055);
        double total = subtotal + tax;
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}