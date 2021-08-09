package com.bridgelabz.javaprograms;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class PrimeNumber {
    public static void main(String[] args) {
        int n, status = 1, num = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime number you want");
        n = sc.nextInt();

        if (n>=1){
            System.out.println("First "+n+" prime numbers are :- ");
            System.out.println(2);
        }

        for (int count = 2; count <= n;){
            for (int j = 2; j<= Math.sqrt(num); j++){
                if(num%j == 0){
                    status = 0;
                    break;
                }
            }
            if (status !=0 ){
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }

    }
}
