/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputHandlerTest {

    @Test
    void calc_returns_18_given_4() {
        //given
        inputHandler test = new inputHandler();

        //when
        int expected = 18;
        int actual = test.calc(4);

        //then
        assertEquals(expected, actual);

    }
    @Test
    void calc_returns_76_given_1() {
        //given
        inputHandler test = new inputHandler();

        //when
        int expected = 76;
        int actual = test.calc(1);

        //then
        assertEquals(expected, actual);

    }
    @Test
    void calc_returns_1_given_76() {
        //given
        inputHandler test = new inputHandler();

        //when
        int expected = 1;
        int actual = test.calc(76);

        //then
        assertEquals(expected, actual);

    }
}