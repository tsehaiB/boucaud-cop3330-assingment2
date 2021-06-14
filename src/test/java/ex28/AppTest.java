/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add_returns_sum_given_doubles() {
        //given
        App test = new App();

        //when
        double actual = test.add(7.0, 3.0);

        //then
        assertEquals(10.0, actual);
    }

    @Test
    void add_returns_sum_given_ints() {
        //given
        App test = new App();

        //when
        double actual = test.add(7, 3);

        //then
        assertEquals(10.0, actual);
    }

    @Test
    void out_returns_int_out_given_ints() {
        //given
        App test = new App();

        //when
        String actual = test.out(10);
        String expected = "The total is 10";

        //then
        assertEquals(expected, actual);
    }
    void out_returns_double_out_given_doubles(){
        //given
        App test = new App();

        //when
        String actual = test.out(10.2);
        String expected = "The total is 10.2";

        //then
        assertEquals(expected, actual);
    }
}