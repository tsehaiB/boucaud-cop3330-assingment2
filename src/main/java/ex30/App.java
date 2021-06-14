/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex30;
import ex30.tableGenerator;

public class App {
    public static void main(String[] args) {
        ex30.App myApp = new ex30.App();
        tableGenerator twelveTimes = new tableGenerator();
        System.out.println(twelveTimes.table());
    }
}