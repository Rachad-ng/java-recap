package com.negra;

public class SymbolComparator {

    public static int compareSymbolToInt(Symbol s1, Symbol s2){

        return s1.compare(s2);

    }

    public static String compareSymbolToString(Symbol s1, Symbol s2){

        String result = "-";

        switch (s1){
            case O : switch (s2){
                case O: break;

                case V: result = "1";
                    break;

                case W: result = "-1";
                    break;
            }

            break;

            case V : switch (s2){
                case O: result = "-1";
                    break;

                case V: break;

                case W: result = "1";
                    break;
            }

            break;

            case W : switch (s2){
                case O: result = "1";
                    break;

                case V: result = "-1";
                    break;

                case W: break;
            }

            break;
        }

        return result;
    }

}
