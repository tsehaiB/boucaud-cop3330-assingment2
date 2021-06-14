/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex29;
import ex29.inputHandler;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        ex29.App myApp = new ex29.App();
        inputHandler getR = new inputHandler();
        double r = getR.returnValidR();
        int years = getR.calc(r);
        myApp.out(years);
    }

    public void out(int years)
    {
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

}