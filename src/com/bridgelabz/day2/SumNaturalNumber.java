package com.bridgelabz.day2;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1 ;
        while ( i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
