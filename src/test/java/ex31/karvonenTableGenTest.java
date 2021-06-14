/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class karvonenTableGenTest {

    @Test
    void tableGen_returns_table_given_age_and_HR() {
        //given
        karvonenTableGen table = new karvonenTableGen();

        //when
        String expected = "Intensity    |Rate    \n" +
                "55%          |138.15 bpm\n" +
                "60%          |144.8 bpm\n" +
                "65%          |151.45 bpm\n" +
                "70%          |158.1 bpm\n" +
                "75%          |164.75 bpm\n" +
                "80%          |171.4 bpm\n" +
                "85%          |178.05 bpm\n" +
                "90%          |184.7 bpm\n" +
                "95%          |191.35 bpm";
        String actual = table.tableGen(22, 65);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void calculate_returns_171_given_22_65_80() {
        //given
        karvonenTableGen table = new karvonenTableGen();

        //when
        double expected = 171.4;
        double actual = table.calculate(22, 65, 80);

        //then
        assertEquals(expected, actual);
    }
}