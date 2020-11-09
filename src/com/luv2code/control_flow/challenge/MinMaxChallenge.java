package com.luv2code.control_flow.challenge;

import java.util.Scanner;

public class MinMaxChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
         * Before the user enters the number, print the message "Enter number:"
         * If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
         *
         * Hint:
         * Use an endless while loop.
         *
         * Bonus:
         * Create a project with the name MinAndMaxInputChallenge.
         * */

        boolean isOver = false;
        int minimumNumber = Integer.MAX_VALUE;
        int maximumNumber = Integer.MIN_VALUE;
        while (!isOver) {
            System.out.print("Enter number: ");
            boolean isAnInteger = scanner.hasNextInt();
            if (isAnInteger) {
                int number = scanner.nextInt();
                if (number < minimumNumber) {
                    minimumNumber = number;
                }

                if (number > maximumNumber) {
                    maximumNumber = number;
                }
            } else {
                isOver = true;
            }

            scanner.nextLine();
        }

        System.out.println("\nMinimum number is: " + minimumNumber);
        System.out.println("Maximum number is: " + maximumNumber);
        scanner.close();
    }
}
