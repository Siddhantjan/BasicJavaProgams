package com.java.learning.programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int res=0;
        System.out.println(" number is "+num);
        while (num>0){
            int temp=num%10;
            num=num/10;
            res = res*10+temp;
        }
        System.out.println("result is "+ res);
    }
}
