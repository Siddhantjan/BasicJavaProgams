package com.java.learning.programs;

import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        while(num>=1){
            fact*=num;
            num--;
        }
        System.out.println(fact);
    }
}
