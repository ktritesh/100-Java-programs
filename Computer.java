package com.bridgelabz.levelthird;

//This program will teach you how to create multiple class in java program
public class Computer {
    Computer(){
        System.out.println("Constructor of computer class.");
    }

    void computer_method(){
        System.out.println("power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}

class Laptop{
    Laptop(){
        System.out.println("Constructor of Laptop class");
    }
    void laptop_method(){
        System.out.println("99% Battery available");
    }
}
