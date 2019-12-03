package com.company.Circle;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double area;

        System.out.print("Enter the radius of circle : ");
        double r = input.nextInt();

        area = circleArea(r);

        System.out.printf("The area is : %f", area);
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
