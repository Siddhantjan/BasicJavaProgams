package com.java.learning.programs;

import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(" factorial of "+num+" is "+factorial(num));

    }
}
