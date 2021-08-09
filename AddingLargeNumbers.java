package com.bridgelabz.javaprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
    public static void main(String[] args) {
        String number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first large number");
        number1 = sc.nextLine();
        System.out.println("Enter Second Large number");
        number2 = sc.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;
        sum = first.add(second);

        System.out.println("Sum of the number is "+sum);
    }
}
