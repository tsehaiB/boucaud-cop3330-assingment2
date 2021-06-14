/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex35;
import ex35.lottery;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ex35.App myApp = new ex35.App();
        lottery pickWinner = new lottery();

        ArrayList<String> participants = pickWinner.makeList();
        int index = pickWinner.generateNum(participants.size());
        String winner = pickWinner.chooseName(participants, index);

        System.out.println("The winner is... " + winner);

    }
}