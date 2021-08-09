package com.bridgelabz.levelthird;

//Static Block application ... we need to open program in specific window
public class StaticBlockSecond {
    public static void main(String[] args) {
        System.out.println("you are using windows NT operating system.");
    }

    static {
        String os = System.getenv("OS");
        if(os.equals("Window_NT")!=true){
            System.exit(1);
        }
    }
}
