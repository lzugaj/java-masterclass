package com.luv2code.introduction.primitive_types;

public class LongMain {

    public static void main(String[] args) {
        // Long has a width of 64 bits

        long myLongValue = 1234L; // Needs to have L at the end

        long minLongValue = Long.MIN_VALUE; // 9223372036854775807
        long maxLongValue = Long.MAX_VALUE; // -9223372036854775808
        System.out.println("Min long value = " + minLongValue);
        System.out.println("Max long value = " + maxLongValue);

        // long myMaxLongValue = 9223372036854775808; -> Long value is to large
        // long myMinLongValue = -9223372036854775809; -> Long value is to large
    }
}
