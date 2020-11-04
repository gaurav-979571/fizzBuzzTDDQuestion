package com.company;
import org.junit.Test;

public class FizzBuzz1To100 {
    @Test
    public void printing() {
        FizzBuzzAction fizzBuzz = new FizzBuzzAction();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.action(i));
        }
    }
}



