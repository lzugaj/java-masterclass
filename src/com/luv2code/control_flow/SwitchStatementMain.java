package com.luv2code.control_flow;

public class SwitchStatementMain {

    public static void main(String[] args) {

        /**
         * If you are switching on the value of a single variable then I'd use a switch every time, it's what the construct was made for.
         * Otherwise, stick with multiple if-else statements.
         * */

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a: " + switchValue);
                break;
            case 6:
                System.out.println("Value was 6");
//                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
    }
}
