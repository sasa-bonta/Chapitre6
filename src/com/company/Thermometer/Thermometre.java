package com.company.Thermometer;

import java.util.Scanner;

public class Thermometre {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the themperature in farenheit : ");
        double fahrenheit = input.nextDouble();
        System.out.printf("Fahrenheit = %.2f ; Celsius = %.2f%n", fahrenheit,celsius(fahrenheit));

        System.out.print("Enter the themperature in Celsius : ");
        double celsius = input.nextDouble();
        System.out.printf("Celsius = %.2f ; Fahtrenheit = %.2f%n",celsius, fahrenheit(celsius));
    }

    public static double celsius (double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit (double celsius) {
        return 9.0 / 5.0 * celsius +32;
    }
}
