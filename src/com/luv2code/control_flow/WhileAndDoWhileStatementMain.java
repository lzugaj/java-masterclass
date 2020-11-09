package com.luv2code.control_flow;

public class WhileAndDoWhileStatementMain {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("----------------------------------------------");

        count = 1;
        do {
            System.out.println("Count value is: " + count);
            count++;
        } while (count != 6);
    }
}
