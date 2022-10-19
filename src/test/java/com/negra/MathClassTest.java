package com.negra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MathClassTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Simple addition should work")
    public void given_two_ints_should_return_sum(){
        int a=2, b=3;
        Assertions.assertEquals(a+b, MathClass.add(a,b));
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void given_two_ints_should_return_multip(){
        int a=2, b=3;
        Assertions.assertEquals(a*b, MathClass.multiply(a,b));
    }

    @Test
    @DisplayName("Simple factorial should work")
    public void given_two_ints_should_return_factorial(){
        int a=6;
        Assertions.assertEquals(720, MathClass.fact(a));
    }

    @Test
    @DisplayName("Simple factorial should work")
    public void given_array_should_return_sorted(){
        int[] a = {9, 4, 5, 2, 8, 1, 7};
        int[] expected = {1, 2, 4, 5, 7, 8, 9};
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(MathClass.sort(a)));
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MathClass.sort(a)));
    }
}
