/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class magicEightTest {

    @Test
    void generateNum_returns_within_range() {
        //given
        magicEight ball = new magicEight();

        //when
        int max = 5;
        int min = 0;
        int actual = ball.generateNum();
        //then
        assertTrue(actual < max && actual > min);
    }
    @Test
    void out_returns_Yes_given_1() {
        //given
        magicEight ball = new magicEight();

        //when
        String expected = "Yes,";
        String actual = ball.out(1);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void out_returns_No_given_2() {
        //given
        magicEight ball = new magicEight();

        //when
        String expected = "No,";
        String actual = ball.out(2);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void out_returns_Maybe_given_3() {
        //given
        magicEight ball = new magicEight();

        //when
        String expected = "Maybe,";
        String actual = ball.out(3);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void out_returns_Ask_Again_later_given_4() {
        //given
        magicEight ball = new magicEight();

        //when
        String expected = "Ask again later.";
        String actual = ball.out(4);
        //then
        assertEquals(expected, actual);
    }
}