package com.luv2code.methods;

public class PlayerPositionChallenge {

    public static void main(String[] args) {
        /**
         * Create a method called displayHighScorePosition it should a display players name as a 1st parameter,and a 2nd parameter as a position in the high score table
         * You should display the players name along with a message like " managed to get into position " and the position they got and a further message " on the high score table".
         *
         * Create a 2nd method called calculateHighScorePosition it should be sent one argument only, the player score it should return an in the return data should be
         * 1 if the score is >= 1000
         * 2 if the score is >= 500 and < 1000
         * 3 if the score is >= 100 and < 500
         * 4 in all other cases
         *
         * call both methods and display the results of the following
         * a score of 1500, 900, 400 and 50
         */

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    private static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position " + highScore + " on the high score table.");
    }

    private static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
