package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseNumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        for (;number != 0;number=number/10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
