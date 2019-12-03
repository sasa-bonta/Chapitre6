package com.company.Hypotenuse;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        double side1;
        double side2;
        double hypotenuse;

        for (i = 1; i <= 3; i++) {
            System.out.printf("***********Triangle %d***********%n", i);
            System.out.print("Enter 1st side : ");
            side1 = input.nextDouble();

            System.out.print("Enter 2nd side : ");
            side2 = input.nextDouble();

            hypotenuse = findHypotenuse(side1, side2);
            System.out.printf("Hypotenuse = %f%n", hypotenuse);
        }
    }
    public static double findHypotenuse(double side1, double side2) {
        double hypotenuse;

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        return hypotenuse;
    }
}
