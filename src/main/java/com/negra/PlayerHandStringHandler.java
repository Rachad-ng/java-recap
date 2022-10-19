package com.negra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerHandStringHandler {

    public static List<Symbol> getSymbols(String playerHandString){

        List<Symbol> symbolList = new ArrayList<>();

        String scoreString = playerHandString.substring(3);
        Arrays.stream(scoreString.split("")).forEach(s -> symbolList.add(Symbol.valueOf(s)));

        return symbolList;
    }

}
