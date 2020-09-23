package com.luv2code.introduction.primitive_types;

public class IntegerMain {

    public static void main(String[] args) {
        // Int has a width of 32 bits

        int minIntValue = Integer.MIN_VALUE; // -2147483648
        int maxIntValue = Integer.MAX_VALUE; // 2147483647
        System.out.println("Min integer value = " + minIntValue);
        System.out.println("Max integer value = " + maxIntValue);

        System.out.println("Busted MAX value = " + (maxIntValue + 1)); // Overflow!
        System.out.println("Busted MIN value = " + (minIntValue - 1)); // Underflow!

        // int myMaxIntValue = 2147483648; -> Integer value is to large
        // int myMinIntValue = -2147483649; -> Integer value is to large
    }
}
