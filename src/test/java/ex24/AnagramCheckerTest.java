/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram_returns_true_for_same_word() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("note", "note");
        //then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_for_common_anagrams() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("desserts", "stressed");
        //then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_false_for_non_anagrams() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("not", "dad");
        //then
        assertFalse(actual);
    }
    @Test
    void isAnagram_returns_true_for_case_insensitive_anagrams() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("desserts", "STRESSED");
        //then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_for_empty_strings() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("", "");
        //then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_false_for_almost_anagrams() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.isAnagram("abcdefg", "fedcbah");
        //then
        assertFalse(actual);
    }


    //checking checkLen method

    @Test
    void checkLen_returns_false_when_length_different() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.checkLen("abcd", "abcdefgh");
        //then
        assertFalse(actual);
    }

    @Test
    void checkLen_returns_true_when_length_same() {
        //given
        AnagramChecker checker = new AnagramChecker();
        //when
        boolean actual = checker.checkLen("abcde", "fghij");
        //then
        assertTrue(actual);
    }
}