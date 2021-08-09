package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the number to check even or odd");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        if(x%2==0)
            System.out.println("Entered no is even");
        else
            System.out.println("Entered no is odd");

    }
}
