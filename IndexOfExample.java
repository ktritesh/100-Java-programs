package com.bridgelabz.levelthird;

public class IndexOfExample {
    public static void main(String[] args) {
        String s1 = "This is index of example";

        //passing substring
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("index");
        System.out.println(index1+ " "+index2);

        //passing substring with from index
        int index3=s1.indexOf("is", 4);
        System.out.println(index3);

        //passing char value
        int index4 = s1.indexOf('s');
        System.out.println(index4);
    }
}
