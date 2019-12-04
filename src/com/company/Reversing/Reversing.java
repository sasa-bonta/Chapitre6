package com.company.Reversing;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        System.out.printf("%.0f",reverseDigits(number));
    }

    public static double reverseDigits (int number) {
        double reversedNum = 0;
        int number2 = number;
        int lenght = 0;
        int i;

        while (number2 != 0) {
            number2 /= 10;
            lenght++;
        }

        while (lenght >= 0) {
            int lastDigit = number % 10;
            reversedNum += Math.pow(10, lenght-1) * lastDigit;
            number = number / 10;
            lenght--;
        }
        return reversedNum;
    }
}
