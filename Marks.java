package com.bridgelabz.javaprograms;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marksobtained, passingMarks;
        passingMarks=40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the marks scored by you");
        marksobtained = sc.nextInt();
        if(marksobtained>=passingMarks){
            System.out.println("You have cleared your exam.");
        }
        else {
            System.out.println("you failed to pass the exam.");
        }
    }
}
