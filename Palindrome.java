package com.bridgelabz.leveltwo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrom");
        original = sc.nextLine();

        int length = original.length();
        for (int i=length-1; i>=0; i--)
            reverse = reverse+original.charAt(i);

        if(original.equals(reverse))
            System.out.println("Entered string is a Palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }
}