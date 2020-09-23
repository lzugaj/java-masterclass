package com.luv2code.introduction.primitive_types;

public class ByteMain {

    public static void main(String[] args) {
        // Byte has a width of 8 bits

        byte minByteValue = Byte.MIN_VALUE; // -128
        byte maxByteValue = Byte.MAX_VALUE; // 127
        System.out.println("Min byte value = " + minByteValue);
        System.out.println("Max byte value = " + maxByteValue);

        // byte myMaxByteValue = 128; -> Byte value is to large
        // byte myMinByteValue = -129; -> Byte value is to large
    }
}
