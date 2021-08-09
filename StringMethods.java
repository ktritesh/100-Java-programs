package com.bridgelabz.levelthird;

public class StringMethods {
    public static void main(String[] args) {
        int n;
        String s = "Java Programming", t = "", u = "";
        System.out.println(s);

        //Find Length of string
        n = s.length();
        System.out.println("Number of character = "+n);

        //Replace character in string
        t = s.replace("Java", "C++");
        System.out.println(s);
        System.out.println(t);

        //Concatenating string with another string
        u = s.concat(" is fun");
        System.out.println(s);
        System.out.println(u);
    }
}
