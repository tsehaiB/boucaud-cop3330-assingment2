/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex37;

import ex36.statsComputer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
class passwordGeneratorTest {

    @Test
    void pickRandomLetter_returns_a_letter(){
        //given
        passwordGenerator generate = new passwordGenerator();
        Random rand = new Random();
        //when
        char actual = generate.pickRandomLetter(rand);
        //then
        assertTrue(Character.isAlphabetic(actual));
    }
    @Test
    void pickRandomLetter_returns_a_number_between_0_and_9(){
        //given
        passwordGenerator generate = new passwordGenerator();
        Random rand = new Random();
        //when
        int actual = generate.pickRandomNumber(rand);
        //then
        assertTrue(Integer.valueOf(actual) >= 0 && Integer.valueOf(actual) <= 10);
    }
    @Test
    void pickRandomSpecialCharacter_returns_a_Special_Character(){
        //given
        passwordGenerator generate = new passwordGenerator();
        Random rand = new Random();
        //when
        char actual = generate.pickSpecialCharacter(rand);
        //then
        assertFalse(Character.isLetterOrDigit(actual));
    }
}