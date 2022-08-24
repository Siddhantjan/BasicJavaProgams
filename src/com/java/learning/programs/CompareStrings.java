package com.java.learning.programs;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fString,secString;
        fString=sc.nextLine();
        secString=sc.nextLine();
        if (fString.compareTo(secString)>0){
            System.out.println("first is greater than second");
        }
        else if(fString.compareTo(secString)<0){
            System.out.println("first is smaller than second");
        }
        else{
            System.out.println("first is equal to second");

        }
    }
}
