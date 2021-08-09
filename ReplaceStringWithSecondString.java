package com.bridgelabz.levelthird;

public class ReplaceStringWithSecondString {
    public static void main(String[] args) {
        String s1 = "My name is Ritesh. My name is KT. My name is Tiwari.";
        String replaceString = s1.replaceAll("is","was"); // it will replace all occurence of is to was
        System.out.println(replaceString);
    }
}
