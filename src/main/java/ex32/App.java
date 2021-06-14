/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex32;
import ex32.guessing;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        ex32.App myApp = new ex32.App();

        guessing game = new guessing();
        boolean play = true;

        game.header();
        while(play) {
            int totalGuesses = 0;
            int difficulty = game.setDifficulty(game.promptLvl());
            int number = game.generateNum(difficulty);
            int guess = game.promptGuess("I have my number. What's your guess? ");
            //System.out.println("Hint: " + number);
            while(guess != number){
                //System.out.printf("%d != %d\n", guess, number);
                if(guess < number)
                    guess = game.promptGuess("Too low. Guess again: ");
                if(guess > number)
                    guess = game.promptGuess("Too high. Guess again: ");
                totalGuesses++;
            }
            System.out.println(game.out(totalGuesses));
            System.out.println("Do you wish to play again (Y/N)? ");
            play = (inp.nextLine().equalsIgnoreCase("y"));
        }
    }
}