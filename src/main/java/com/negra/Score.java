package com.negra;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private String playerLablel;

    private List<String> results;

    private String scoreString;

    public Score(PlayerHand firstPlayerHand, PlayerHand secondPlayerHand, int roundsNumber){

        int firstPlayerScoreResum = firstPlayerHand.isWinner(secondPlayerHand);

        buildScoreString(firstPlayerHand, secondPlayerHand, firstPlayerScoreResum, roundsNumber);
    }

    public void buildScoreString(PlayerHand firstPlayerHand, PlayerHand secondPlayerHand, int firstPlayerScoreResum, int roundsNumber){

        results = new ArrayList<>();

        String symbolComparingResult;

        if(firstPlayerScoreResum == 0){

            for (int i = 0; i < roundsNumber; i++){
                symbolComparingResult = SymbolComparator.compareSymbolToString(firstPlayerHand.getSymbolList().get(i), secondPlayerHand.getSymbolList().get(i));
                results.add(symbolComparingResult);
            }

            for (int i = 0; i < roundsNumber; i++){
                symbolComparingResult = SymbolComparator.compareSymbolToString(secondPlayerHand.getSymbolList().get(i), firstPlayerHand.getSymbolList().get(i));
                results.add(symbolComparingResult);
            }

            scoreString = "No winner : \n"
                    + firstPlayerHand.getLabel() + " score: " + results.get(0) + ", " + results.get(1) + ", " + results.get(2) + "\n"
                    + secondPlayerHand.getLabel() + " score: " + results.get(3) + ", " + results.get(4) + ", " + results.get(5);

        }else if(firstPlayerScoreResum > 0){

            for (int i = 0; i < roundsNumber; i++){
                symbolComparingResult = SymbolComparator.compareSymbolToString(firstPlayerHand.getSymbolList().get(i), secondPlayerHand.getSymbolList().get(i));
                results.add(symbolComparingResult);
            }

            scoreString = firstPlayerHand.getLabel() + " won, score: " + results.get(0) + ", " + results.get(1) + ", " + results.get(2);

        }else {

            for (int i = 0; i < roundsNumber; i++){
                symbolComparingResult = SymbolComparator.compareSymbolToString(secondPlayerHand.getSymbolList().get(i), firstPlayerHand.getSymbolList().get(i));
                results.add(symbolComparingResult);
            }

            scoreString = secondPlayerHand.getLabel() + " won, score: " + results.get(0) + ", " + results.get(1) + ", " + results.get(2);

        }

    }

    @Override
    public String toString(){
        return scoreString;
    }

}
