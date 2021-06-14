/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class lotteryTest {

    @Test
    void generateNum_given_small_maxSize() {
        //given
        lottery winner = new lottery();

        //when
        int expected = 0;
        int actual = winner.generateNum(1);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void generateNum_given_lage_maxSize() {
        //given
        lottery winner = new lottery();

        //when
        int max = 100;
        int min = 0;
        int actual = winner.generateNum(max);

        //then
        assertTrue(actual > min && actual < max);
    }

    @Test
    void chooseName_returns_name_at_index_2() {
        //given
        lottery winner = new lottery();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Artemis");
        temp.add( "Jake");
        temp.add("Amy");
        temp.add("Joseph");
        //when
        String expected = "Amy";
        String actual = winner.chooseName(temp, 2);

        //then
        assertEquals(expected, actual);
    }
}