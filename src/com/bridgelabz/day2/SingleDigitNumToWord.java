package com.bridgelabz.day2;
import java.util.Scanner;
public class SingleDigitNumToWord {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a single digit number: ");
            int n = s.nextInt();
            String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            if (n >= 0 && n <= 9) {
                System.out.println(words[n]);
            } else {
                System.out.println("Invalid number");
            }
        }
    }

