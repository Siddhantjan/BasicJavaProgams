package com.java.learning.programs;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println("your "+num+" is even");
        }
        else {
            System.out.println("your "+num+" is odd");

        }
    }
}
