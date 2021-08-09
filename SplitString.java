package com.bridgelabz.levelthird;

public class SplitString {
    public static void main(String[] args) {
        String s1 = "java string split method by Ritesh KT";
        String[] words = s1.split("\\s");
        //using for each loop to print element of string array
        for(String w:words){
            System.out.println(w);
        }
    }
}
