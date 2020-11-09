package com.luv2code.control_flow.challenge;

public class IsEvenNumberChallenge {

    public static void main(String[] args) {
        /**
         * Create a method called isEvenNumber that takes a parameter of type int.
         * It's purpose is to determine if the argument passed to the method is an even number or not.
         * Return true if an even number, otherwise return false.
         *
         * Make it also record the total number of even numbers it has found.
         * And break once 5 are found and at the end, display the total number of even numbers found.
         * */

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            if (count < 5) {
                if (isEvenNumber(number)) {
                    System.out.println(number + " is even number.");
                    count++;
                }

                number++;
            } else {
                break;
            }
        }
    }

    private static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
