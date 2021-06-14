/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex28;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        ex28.App myApp = new ex28.App();
        double sum = 0.0;
        for(int i = 0; i < 5; i++){
            double num = myApp.readNum();
            myApp.add(sum, num);
        }
        System.out.println(myApp.out(sum));
    }
    public double add(double sum, double num){
        return sum + num;
    }
    public String out(double sum)
    {
        if(sum == (int)sum)
            return ("The total is " + (int)sum);
        else
            return ("the total is " + sum);
    }
    public double readNum(){
        System.out.print("Enter a number: ");
        return inp.nextDouble();
    }

}