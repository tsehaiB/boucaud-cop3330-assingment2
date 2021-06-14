/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex33;
import ex33.magicEight;

public class App {

    public static void main(String[] args) {
        ex33.App myApp = new ex33.App();
        magicEight answer = new magicEight();

        answer.header();
        answer.question();

        int rand = answer.generateNum();
        System.out.print(answer.out(rand));
    }
}