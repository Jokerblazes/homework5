package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_is_3_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz"
        );
        fizzBuzzGame.start(3);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_Buzz_when_is_5_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz"
        );
        fizzBuzzGame.start(5);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_Whizz_when_is_7_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz"
        );
        fizzBuzzGame.start(7);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz"
        );
        fizzBuzzGame.start(13);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_FizzBuzz_when_is_15_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz"
        );
        fizzBuzzGame.start(15);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_FizzWhizz_when_is_21_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz"
        );
        fizzBuzzGame.start(21);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_35_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz"
        );
        fizzBuzzGame.start(70);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }




    @Test
    public void should_return_FizzBuzzWhizz_when_is_105_multiple() {
        List<String> expectedResults = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzWhizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "Whizz", "29", "Fizz",
                "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz",
                "41", "FizzWhizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "Whizz", "Buzz",
                "Fizz", "52", "Fizz", "Fizz", "Buzz", "Whizz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzWhizz",
                "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "Whizz", "Fizz", "79", "Buzz",
                "Fizz", "82", "Fizz", "FizzWhizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Whizz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Whizz", "Fizz", "Buzz",
                "101","Fizz","Fizz","104","FizzBuzzWhizz"
        );
        fizzBuzzGame.start(105);
        assertThat(fizzBuzzGame.getResults(), equalTo(expectedResults));
    }






}
