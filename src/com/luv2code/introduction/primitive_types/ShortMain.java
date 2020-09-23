package com.luv2code.introduction.primitive_types;

public class ShortMain {

    public static void main(String[] args) {
        // Short has a width of 16 bits

        short minShortValue = Short.MIN_VALUE; // -32768
        short maxShortValue = Short.MAX_VALUE; // 32767
        System.out.println("Min short value = " + minShortValue);
        System.out.println("Max short value = " + maxShortValue);

        // short myMaxShortValue = 32768; -> Short value is to large
        // short myMinShortValue = -32769; -> Short value is to large
    }
}
