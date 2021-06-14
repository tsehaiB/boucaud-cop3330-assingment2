/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex24;
import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String firstWord = myApp.readStr("first");
        String secondWord = myApp.readStr("second");
        AnagramChecker check = new AnagramChecker();
        if(check.checkLen(firstWord, secondWord))
        {
            boolean anagram = check.isAnagram(firstWord, secondWord);
            myApp.printOut(firstWord, secondWord, anagram);
        }
        else
            System.out.println("Input Error. Please enter two strings of the same length.");
    }
    private String readStr(String word){
        System.out.print("Enter the " + word + " string: ");
        return inp.nextLine();
    }
    private void printOut(String wordOne, String wordTwo, boolean anagram){
        if(anagram)
            System.out.println("\""+ wordOne + "\" and \"" + wordTwo + "\" are anagrams.");
        else
            System.out.println("\""+ wordOne + "\" and \"" + wordTwo + "\" are not anagrams.");
    }
}
