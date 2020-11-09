package com.luv2code.control_flow.excercise;

public class ShareDigit {

    public static void main(String[] args) {
        /**
         * Write a method named hasSharedDigit with two parameters of type int.
         * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
         * If one of the numbers is not within the range, the method should return false.
         *
         * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
         *
         * EXAMPLE INPUT/OUTPUT:
         * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
         * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
         * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
         *
         * NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
         * NOTE: Do not add a main method to the solution code.
         * */

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    private static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (isBetweenRange(firstNumber) && isBetweenRange(secondNumber)) {
            int firstDigitOfFirstNumber = firstNumber / 10;
            int lastDigitOfFirstNumber = firstNumber % 10;
            int firstDigitOfSecondNumber = secondNumber / 10;
            int lastDigitOfSecondNumber = secondNumber % 10;
            return (isEquals(firstDigitOfFirstNumber, firstDigitOfSecondNumber) || isEquals(firstDigitOfFirstNumber, lastDigitOfSecondNumber)) ||
                    (isEquals(lastDigitOfFirstNumber, firstDigitOfSecondNumber) || isEquals(lastDigitOfFirstNumber, lastDigitOfSecondNumber));
        }

        return false;
    }

    private static boolean isBetweenRange(int number) {
        return (number >= 10) && (number <= 99);
    }

    private static boolean isEquals(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber;
    }
}