package com.luv2code.control_flow.challenge;

import java.util.ArrayList;
import java.util.List;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        /**
         * Create a for statement using a range of numbers from 1 to 1000 inclusive.
         * Sum all the numbers that can be divided with both 3 and also with 5.
         * For those numbers that met the above conditions, print out the number.
         * Break out of the loop once you find 5 numbers that met the above conditions.
         * After breaking out of the loop print the sum of the numbers that met the above conditions.
         *
         * Note: Type all code in main method
         * */

        findFirstFiveNumbersDivisibleByThreeAndFive();
    }

    private static void findFirstFiveNumbersDivisibleByThreeAndFive() {
        int count = 0;
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (count < 5) {
                if (isDivisibleByThreeAndFive(i)) {
                    numbers.add(i);
                    sum = sumNumberDivisibleByThreeAndFive(numbers);
                    count++;
                }
            }
        }

        printSumOfFirstFiveNumbersDivisibleByThreeAndFive(sum);
    }

    private static boolean isDivisibleByThreeAndFive(int number) {
        return (number % 3 == 0) && (number % 5 == 0);
    }

    private static int sumNumberDivisibleByThreeAndFive(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        return sum;
    }

    private static void printSumOfFirstFiveNumbersDivisibleByThreeAndFive(int sum) {
        System.out.println("Sum off first five numbers divisible by three and five is: " + sum);
    }
}
