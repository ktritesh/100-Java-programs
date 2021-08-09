package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n, m;
        System.out.println("Enter the integer for multiplication table ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Multiplication Table of "+n+"is :-");

        for(m=1; m<=10; m++)
            System.out.println(n+"*"+m+" = "+(n*m));
    }
}
