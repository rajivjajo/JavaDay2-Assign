package com.bridgelabz.day2;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x : ");
        int x = scanner.nextInt();
        System.out.println("enter y : ");
        int y = scanner.nextInt();

       double distance = Math.pow(x*x + y*y,0.5);
        System.out.println("The distance of co-ordinates from origin is : " +distance);
    }
}
