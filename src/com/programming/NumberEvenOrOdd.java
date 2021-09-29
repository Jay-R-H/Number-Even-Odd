package com.programming;

import java.util.Scanner;

public class NumberEvenOrOdd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                     // Taking input from the user for checking the number for odd or even
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int check;
                                                                // Checking the conditions to get the status for number -> even and odd
        if((num % 2) == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
