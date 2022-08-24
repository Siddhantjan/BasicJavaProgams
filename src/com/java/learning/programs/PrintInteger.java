package com.java.learning.programs;

public class PrintInteger {
    public static void main(String[] args) {
        /* print 10 integers */
        int c;
        for(c=1;c<=10;c++){
            System.out.println(c);
        }
        // here after check c increased by 1 for fails
        System.out.println(c);
    }
}
