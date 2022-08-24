package com.java.learning.programs;

import java.util.Scanner;

public class FahrenightToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner sc= new Scanner(System.in);
        temperature=sc.nextFloat();
        float celsius=((temperature-32)*5)/9;
        System.out.println(celsius);
    }
}
