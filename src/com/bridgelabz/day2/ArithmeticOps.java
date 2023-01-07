package com.bridgelabz.day2;

import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;
        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

