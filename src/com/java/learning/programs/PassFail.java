package com.java.learning.programs;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int obtainMarks=sc.nextInt();
        int passingMarks=45;
        if (passingMarks<=obtainMarks){
            System.out.println("Congrats you passed");
        }
        else {
            System.out.println(" hey Buddy you failed!");
        }
    }
}
