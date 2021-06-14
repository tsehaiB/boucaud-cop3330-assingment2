/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordStrengthTest {

    @Test
    void passwordValidator_returns_1_when_only_numbers() {
        //given
        passwordStrength strength = new passwordStrength();

        //when
        int actual = strength.passwordValidator("1234567");
        int expected = 1;

        //then
        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_returns_2_when_only_letters() {
        //given
        passwordStrength strength = new passwordStrength();

        //when
        int actual = strength.passwordValidator("abcdef");
        int expected = 2;

        //then
        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_returns_3_alphanumeric_long() {
        //given
        passwordStrength strength = new passwordStrength();

        //when
        int actual = strength.passwordValidator("abc123efg");
        int expected = 3;

        //then
        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_returns_4_when_alphanumeric_long_specicalCharacters() {
        //given
        passwordStrength strength = new passwordStrength();

        //when
        int actual = strength.passwordValidator("123abc!@#");
        int expected = 4;

        //then
        assertEquals(expected, actual);

    }
    @Test
    void passwordValidator_returns_1_noInput() {
        //given
        passwordStrength strength = new passwordStrength();

        //when
        int actual = strength.passwordValidator("");
        int expected = 1;

        //then
        assertEquals(expected, actual);

    }
}