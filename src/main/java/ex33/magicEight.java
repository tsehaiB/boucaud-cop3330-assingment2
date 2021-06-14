/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex33;
import java.util.Scanner;
import java.util.Random;
public class magicEight {
    private final static Scanner inp = new Scanner(System.in);
    public int generateNum(){
        Random rand = new Random();
        return rand.nextInt(5);
    }
    public void header(){
        System.out.println("What's your question?");
    }
    public String out(int n){
        return switch (n) {
            case 1 -> "Yes,";
            case 2 -> "No,";
            case 3 -> "Maybe,";
            case 4 -> "Ask again later.";
            default -> "Error: There is no answer.";
        };
    }
    public void question(){
        System.out.print("> ");
        inp.nextLine();
    }

}
