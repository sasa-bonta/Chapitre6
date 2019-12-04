package com.company.CoinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTassing {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int heads = 0, tails = 0;

        System.out.print("Enter 1 to toss coin or any other number to quit : ");
        int start = input.nextInt();

        while (start == 1) {

            int coin = tossCoin();
            switch (coin) {
                case 0: {
                    System.out.println("Head");
                    heads++;
                    break;
                }
                case 1: {
                    System.out.println("Tail");
                    tails++;
                    break;
                }
            }

            System.out.print("Enter 1 to toss coin any other number to quit: ");
            start = input.nextInt();
        }
        System.out.printf("Heads : %d%nTails : %d%n", heads, tails);

    }

        public static int tossCoin () {
            SecureRandom randomNumbers = new SecureRandom();
            int coin = randomNumbers.nextInt(2);
            return coin;
        }
    }

