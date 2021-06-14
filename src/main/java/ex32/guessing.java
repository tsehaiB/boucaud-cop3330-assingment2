/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex32;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class guessing {
    private final static Scanner inp = new Scanner(System.in);
    public int setDifficulty(int level){
        return (int) Math.pow(10, level);
        //10^1 = 10, 10^2 = 100, 10^3 = 1000.
    }
    public int generateNum(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }
    public void header(){
        System.out.println("Let's play Guess the Number!\n");
    }
    public int promptLvl(){
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        while (true) {
            try {
                int n = inp.nextInt();
                return n;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a numerical input");
                inp.nextLine();
            }
        }
    }
    public int promptGuess(String prompt){
        System.out.print(prompt);
        try {
            int n = inp.nextInt();
            return n;
        }
        catch (InputMismatchException e){
            inp.nextLine();
            return 0;
        }
    }
    public String out(int guess){
        return "You got it in " + guess + " guesses!\n";
    }

}
