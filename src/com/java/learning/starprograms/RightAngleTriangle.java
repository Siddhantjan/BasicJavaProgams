package com.java.learning.starprograms;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            *****
         */
        Scanner sc=new Scanner(System.in);
        int line= sc.nextInt();
        for (int i = 0;i<line;i++){
            for (int j  =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
