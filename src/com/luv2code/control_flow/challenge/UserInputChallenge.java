package com.luv2code.control_flow.challenge;

import java.util.Scanner;

public class UserInputChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Read 10 numbers from the console entered by the user and print the sum of those numbers.
         * Create a Scanner like we did in the previous video.
         * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
         * If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
         * Use the nextInt() method to get the number and add it to the sum.
         * Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1, 2, 3, 4, etc.
         * For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2: ", and so on.
         *
         * Hint:
         * Use a while loop.
         * Use a counter variable for counting valid numbers.
         * Close the scanner after you don't need it anymore.
         * Create a project with the name ReadingUserInputChallenge.
         * */

        int sum = 0;
        int count = 1;
        boolean flag = true;
        while (flag) {
            if (count > 10) {
                break;
            }

            System.out.print("Enter number #" + count + ": ");
            boolean isAnInteger = scanner.hasNextInt();
            if (isAnInteger) {
                int enteredNumber = scanner.nextInt();
                sum += enteredNumber;
                count++;
            } else {
                flag = false;
                System.out.println("\nInvalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("\nSum of entered numbers is: " + sum);
        scanner.close();
    }
}
