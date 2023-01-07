package com.bridgelabz.day2;

import java.util.Scanner;

public class Quadratic {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter val of a : ");
            double a = scanner.nextInt();
            System.out.println("enter val of b : ");
            double b = scanner.nextInt();
            System.out.println("enter val of c ; ");
            double c = scanner.nextInt();
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Root: " + root);
            } else {
                System.out.println("No real roots.");
            }
        }







}
