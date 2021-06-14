/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex29;
import java.util.InputMismatchException;
import java.lang.Math;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
public class inputHandler {
    Scanner inp = new Scanner(System.in);
    public double returnValidR() {
        while (true) {
            try {
                System.out.print("What is the rate of return? ");
                double r = inp.nextDouble();
                if(r == 0.0)
                    throw new IllegalArgumentException("0 is out of range");
                return r;
            }
            catch (InputMismatchException | IllegalArgumentException e){
                    System.out.println("Sorry. That's not a valid input.");
                inp.nextLine();
            }
        }
    }
    public int calc(double r){
        return (int)Math.ceil(72/r);
    }
}
