package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter value of X and Y");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("Addition of x and y is "+z);
    }
}
