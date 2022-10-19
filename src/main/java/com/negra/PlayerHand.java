package com.negra;

import java.util.ArrayList;
import java.util.List;

public class PlayerHand {

    private String label;

    private List<Symbol> symbolList;

    public PlayerHand(String playerHandString){
        this.label = playerHandString.substring(0, 2);
        this.symbolList = PlayerHandStringHandler.getSymbols(playerHandString);
    }

    public String getLabel(){
        return label;
    }

    public List<Symbol> getSymbolList(){
        return symbolList;
    }

    public int isWinner(PlayerHand playerHand){

        List<Integer> scores = new ArrayList<>();

        int result;

        for(int i=0; i<3; i++){
            result = SymbolComparator.compareSymbolToInt(getSymbolList().get(i), playerHand.getSymbolList().get(i) );
            scores.add(result);
        }

        return scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

}
