package com.java.learning.programs;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        /* swap to  numbers without using extra variable*/
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("num1 : "+num1+" num2 : "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num1 : "+num1+" num2 : "+num2);



    }
}
