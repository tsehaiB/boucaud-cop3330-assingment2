/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex37;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class passwordGenerator {
    Random rand = new Random(1000);
    public char pickRandomLetter(Random rand){
        int randomLetter = rand.nextInt(26);
        return (char)(97 + randomLetter);
    }
    public int pickRandomNumber(Random rand){
        int randomNumber = rand.nextInt(10);
        return randomNumber;
    }
    public char pickSpecialCharacter(Random rand){
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '`', '~', '<', '>', '/', '?'};
        int randomNumber = rand.nextInt(specialChars.length);
        return specialChars[randomNumber];
    }
    public ArrayList<String> randomPass(int length, int numSpecial, int numInts){
        ArrayList<String> letters = new ArrayList<>();
        int i = 0;
        while(i < length){
            if(rand.nextInt(3) == 1 && numSpecial > 0){
                String next = String.valueOf(pickSpecialCharacter(rand));
                letters.add(next);
                numSpecial--;
                i++;
            }
            else if(rand.nextInt(3) == 2 && numInts > 0){
                String next = String.valueOf(pickRandomNumber(rand));
                letters.add(next);
                numInts--;
                i++;
            }
            else if((numSpecial + numInts) < length-i){
                String next = String.valueOf(pickRandomLetter(rand));
                letters.add(next);
                i++;
            }
            else {
                continue;
            }
        }
        return letters;
    }

}
