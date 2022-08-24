package com.java.learning.programs;

import java.util.Scanner;

public class InputByScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        float b= sc.nextFloat();
        long c= sc.nextLong();
        byte d= sc.nextByte();
        short e= sc.nextShort();
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
    }
}
