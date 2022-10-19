package com.negra;

public class Janken {

    public static final int ROUNDS_NUMBER = 3;

    public String computeScore(String firstPlayerHandString, String secondPlayerHandString){

        PlayerHand firstPlayerHand = new PlayerHand(firstPlayerHandString);
        PlayerHand secondPlayerHand = new PlayerHand(secondPlayerHandString);

        Score score = new Score(firstPlayerHand, secondPlayerHand, ROUNDS_NUMBER);

        return score.toString();
    }

}
