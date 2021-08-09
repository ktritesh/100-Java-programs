package com.bridgelabz.levelthird;

public class CreateMethodsInJava {
    //Constructor Method
    public CreateMethodsInJava() {
        System.out.println("Constructor method is called when an object of it's class is created");
    }
    //Main method when program execution begins
    public static void main(String[] args) {
        staticMethod();
        CreateMethodsInJava createMethodsInJava = new CreateMethodsInJava();
        createMethodsInJava.nonStaticMethod();
    }

    //Static Method
    static void staticMethod(){
        System.out.println("Static method can be called without creating object");
    }

    //Non-Static Method
    void nonStaticMethod(){
        System.out.println("Non static method must be called by creating an object");
    }
}
