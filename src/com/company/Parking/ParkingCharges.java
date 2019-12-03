package com.company.Parking;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int customers, i;
        double time;
        int hours;
        int minuts;
        double payment;

        System.out.print("Enter the number of customers : ");
        customers = input.nextInt();

        for (i = 0; i < customers; i++) {

            System.out.printf(" **********--Customer %d--***********%n", i + 1);

            System.out.print("Enter the hours of customer : ");
            hours = input.nextInt();
            System.out.print("Minuts : ");
            minuts = input.nextInt();

            time = (hours + (double) minuts / 100 * 1.6666667);
            System.out.printf("During of parking in hours : %.2f%n", time);

            if (time > 24) {
                System.out.println("Error time is > 24");
                break;
            }

            time = Math.ceil(time);
            payment = calculateCharges(time);

            System.out.printf("The parking charge is : %.2f%n", payment);
        }
    }

    public static double calculateCharges(double time) {
        double price = 0;

        if (time <= 3) {
            price = 2;
        }

        if (time > 3) {
            price = 2 + (time -3) * 0.5;
        }

        if (price > 10)
            price = 10;

        return price;
    }
}
