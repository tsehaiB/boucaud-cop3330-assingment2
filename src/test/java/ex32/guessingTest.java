/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessingTest {

    @Test
    void setDifficulty_returns_10_given_1() {
        //given
        guessing difficulty = new guessing();

        //when
        int expected = 10;
        int actual = difficulty.setDifficulty(1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void setDifficulty_returns_100_given_2() {
        //given
        guessing difficulty = new guessing();

        //when
        int expected = 100;
        int actual = difficulty.setDifficulty(2);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void setDifficulty_returns_1000_given_3() {
        //given
        guessing difficulty = new guessing();

        //when
        int expected = 1000;
        int actual = difficulty.setDifficulty(3);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void generateNum_returns_in_range_given_max_10() {
        //given
        guessing generator = new guessing();

        //when
        int min = 0;
        int max = 10;
        int actual = generator.generateNum(max);

        //then
        assertTrue(actual < max && actual > min);
    }
    @Test
    void generateNum_returns_in_range_given_max_100() {
        //given
        guessing generator = new guessing();

        //when
        int min = 0;
        int max = 100;
        int actual = generator.generateNum(max);

        //then
        assertTrue(actual < max && actual > min);
    }
    @Test
    void generateNum_returns_in_range_given_max_1000() {
        //given
        guessing generator = new guessing();

        //when
        int min = 0;
        int max = 1000;
        int actual = generator.generateNum(max);

        //then
        assertTrue(actual < max && actual > min);
    }
}