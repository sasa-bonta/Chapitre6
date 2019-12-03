package com.company.Square;

import java.util.Scanner;


public class Square {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter the size of square : ");
        int a = input.nextInt();
        System.out.print("Enter the char : ");
        char s = input.next().charAt(0);

        printSquare(a, s);


    }

    public static void printSquare(int a, char s) {
        int i, j;
        if (a == 1)
            System.out.printf("%c", s);
        else {
            for (i = 0; i < a; i++) {
                System.out.printf("%c ", s);
            }

            System.out.println("");

            for (i = 0; i < a - 2; i++) {
                System.out.printf("%c", s);
                System.out.printf(" ");

                for (j = 0; j < a - 2; j++) {
                    System.out.printf("%c ", s);
                }

                System.out.printf("%c %n",s);
            }

            for (i = 0; i < a; i++) {
                System.out.printf("%c ",s);
            }
        }
    }
}
