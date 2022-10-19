package com.negra;

import java.util.Arrays;

public class MathClass {

    public static int add(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int fact(int n){
        return (n == 0) ? 1 : n * fact(n - 1);
    }

    public static int[] sort(int[] tab){
        Arrays.sort(tab);
        return tab;
    }

}
