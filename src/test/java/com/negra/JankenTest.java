package com.negra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class JankenTest {//O: Rock, W: Paper V: Scissors; score: - means a draw, 0 lose, 1 win

    @Test
    @DisplayName("Round 1")
    public void given_round1_should_return_score(){
        Janken janken = new Janken();
        String firstPlayerHand = "P1:WOV";
        String secondPlayerHand = "P2:WVW";

        String test = janken.computeScore(firstPlayerHand, secondPlayerHand);
        Assertions.assertEquals("P1 won, score: -, 1, 1", janken.computeScore(firstPlayerHand, secondPlayerHand));
    }

    @Test
    @DisplayName("Round 2")
    public void given_round2_should_return_score(){
        Janken janken = new Janken();
        String firstPlayerHand = "P1:VOV";
        String secondPlayerHand = "P2:WVO";

        Assertions.assertEquals("P1 won, score: 1, 1, -1", janken.computeScore(firstPlayerHand, secondPlayerHand));
    }

    @Test
    @DisplayName("Round 3")
    public void given_round3_should_return_score(){
        Janken janken = new Janken();
        String firstPlayerHand = "P1:WVW";
        String secondPlayerHand = "P2:VOV";

        Assertions.assertEquals("P2 won, score: 1, 1, 1", janken.computeScore(firstPlayerHand, secondPlayerHand));
    }

}
