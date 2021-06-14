/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputValidatorTest {

    @Test
    void validateInput_returns_empty_given_all_valid() {
        //given
        inputValidator input = new inputValidator();

        //when
        String expected = "";
        String actual = input.validateInput("John", "Johnson", "12345", "AA-1234");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void validateInput_returns_errors_given_all_invalid() {
        //given
        inputValidator input = new inputValidator();

        //when
        String expected = "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The first name must be filled in.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.";
        String actual = input.validateInput("", "", "ABCDE", "EFGHI");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void filled_returns_false_given_empty() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = false;
        boolean actual = input.filled("");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void filled_returns_true_given_more_than_one() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = true;
        boolean actual = input.filled("abc");

        //then
        assertEquals(expected, actual);
    }


    @Test
    void len_returns_true_given_more_that_one() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = true;
        boolean actual = input.len("abc");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void len_returns_false_given_less_that_two() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = false;
        boolean actual = input.len("");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void employeeIDFormat_returns_true_given_valid() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = true;
        boolean actual = input.employeeIDFormat("AB-1234");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void employeeIDFormat_returns_false_given_invalid() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = false;
        boolean actual = input.employeeIDFormat("abcde");

        //then
        assertEquals(expected, actual);
    }
    @Test
    void zipCodeFormat_returns_true_given_valid() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = true;
        boolean actual = input.zipCodeFormat("12345");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void zipCodeFormat_returns_false_given_invalid() {
        //given
        inputValidator input = new inputValidator();

        //when
        boolean expected = false;
        boolean actual = input.zipCodeFormat("abcde");

        //then
        assertEquals(expected, actual);
    }
}