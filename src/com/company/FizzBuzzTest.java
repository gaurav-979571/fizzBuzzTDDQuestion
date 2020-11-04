package com.company;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
        @Test
        public void noAction() {
            FizzBuzzAction fizzBuzz = new FizzBuzzAction();
            Assert.assertEquals("1", fizzBuzz.action(1));
            Assert.assertEquals("2", fizzBuzz.action(2));
        }
        @Test
        public void divisibleBy3() {

            FizzBuzzAction fizzBuzz = new FizzBuzzAction();
            Assert.assertEquals("Fizz", fizzBuzz.action(3));
            Assert.assertEquals("Fizz", fizzBuzz.action(6));
        }
        @Test
        public void divisibleBy5() {

            FizzBuzzAction fizzBuzz = new FizzBuzzAction();
            Assert.assertEquals("Buzz", fizzBuzz.action(5));
            Assert.assertEquals("Buzz", fizzBuzz.action(10));
        }
        @Test
        public void divisibleByBoth3And5(){
            FizzBuzzAction fizzBuzz = new FizzBuzzAction();
            Assert.assertEquals("FizzBuzz",fizzBuzz.action(15));
        }
}



