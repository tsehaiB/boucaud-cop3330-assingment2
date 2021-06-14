/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex24;
import java.util.Arrays;
public class AnagramChecker {
    public boolean isAnagram(String firstWord, String secondWord){
        boolean result;

        char[] wordOne = firstWord.toCharArray();
        char[] wordTwo = secondWord.toCharArray();
        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);
        firstWord = Arrays.toString(wordOne);
        secondWord = Arrays.toString(wordTwo);
        return firstWord.equalsIgnoreCase(secondWord);

    }
    public boolean checkLen(String firstWord, String secondWord){
        return firstWord.length() == secondWord.length();
    }
}
