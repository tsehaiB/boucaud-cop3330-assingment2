/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex31;
import ex31.karvonenTableGen;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        ex31.App myApp = new ex31.App();

        karvonenTableGen generate = new karvonenTableGen();
        double restingHR = generate.getValidNum("Resting Pulse: ");
        int age = (int)generate.getValidNum("Age: ");
        System.out.print(generate.tableGen(age, restingHR));
    }
}
