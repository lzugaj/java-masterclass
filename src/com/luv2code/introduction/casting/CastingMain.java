package com.luv2code.introduction.casting;

public class CastingMain {

    public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;
        byte myByteValue = (byte) (minByteValue / 2);
        System.out.println("myByteValue = " + myByteValue);

        short myShortValue = (short) (minByteValue / 2);
        System.out.println("myShortValue = " + myShortValue);
    }
}
