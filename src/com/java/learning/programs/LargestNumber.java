package com.java.learning.programs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b && a>c){
            System.out.println("a "+a);
        }else if(b>c && b>a){
            System.out.println("b "+b);
        }
        else{
            System.out.println("c "+c);

        }
    }
}
