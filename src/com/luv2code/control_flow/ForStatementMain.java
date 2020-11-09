package com.luv2code.control_flow;

public class ForStatementMain {

    public static void main(String[] args) {
        /**
         * for (initialization; termination; increment) { body }
         * */

        for (double i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("----------------------------------------------");

        for (double i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    private static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}