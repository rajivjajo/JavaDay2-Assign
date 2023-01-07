package com.bridgelabz.day2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        int m = scanner.nextInt();
        System.out.println("Enter date");
        int d = scanner.nextInt();
        if (m == 3 && d >= 20 || m == 4 || m == 5 || m == 6 && d <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

