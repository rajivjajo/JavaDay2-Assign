package com.bridgelabz.day2;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int unit = number % 10;
        int ten = (number / 10) % 10;
        int hundred = (number / 100) % 10;
        int thousand = (number / 1000) % 10;
        System.out.println("Unit place: " + unit);
        System.out.println("Ten place: " + ten);
        System.out.println("Hundred place: " + hundred);
        System.out.println("Thousand place: " + thousand);
    }
}
