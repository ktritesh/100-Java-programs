package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x>y && x>z)
            System.out.println("First number is largest");
        else if(y>x && y>z)
            System.out.println("Second number is largest");
        else if (z>x && z>y)
            System.out.println("Third number is the largest");
        else
            System.out.println("Entered numbers are not distinct");
    }
}
