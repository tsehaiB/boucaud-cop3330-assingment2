/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex26;
import ex26.PaymentCalculator;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        ex26.App myApp = new ex26.App();
        int balance = myApp.readInt("What is your balance? ");
        double apr = myApp.readInt("What is the APR on the card (as a percent)? ")/100.0;
        int payment = myApp.readInt("What is the monthly payment you can make? ");
        PaymentCalculator calc = new PaymentCalculator();
        int months = calc.calculateMonthsUntilPaidOff(balance, apr, payment);
        myApp.printOut(months);
    }
    private int readInt(String prompt){
        System.out.print(prompt);
        return inp.nextInt();
    }
    private void printOut(int months){
        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}