/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;
public class karvonenTableGen {
    Scanner inp = new Scanner(System.in);
    public String tableGen(int age, double restingHR){
        karvonenTableGen generate = new karvonenTableGen();
        String output = "";

        output += String.format("%-13s|%-8s\n", "Intensity", "Rate");
        for(int i = 55; i < 100; i+=5){
            output += String.format("%-13s|%-8s", (i + "%"), (generate.calculate(age, restingHR, i) + " bpm"));
            if(i < 95)
                output += "\n";
        }
        return output;
    }
    public double getValidNum(String prompt){
        while (true) {
            try {
                System.out.print(prompt);
                double n = inp.nextDouble();
                return n;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a numerical input");
                inp.nextLine();
            }
        }
    }
    public double calculate(int age, double restingHR, double intensity){
        return (((220 - age) - restingHR) * (intensity/100.0)) + restingHR;
    }
}
