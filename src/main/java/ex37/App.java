/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex37;
import ex37.passwordGenerator;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        ex37.App myApp = new ex37.App();
        passwordGenerator makePass = new passwordGenerator();
        int length = myApp.readParameters("What's the minimum length? ");
        int numSpecial = myApp.readParameters("How many special characters? ");
        int numInts = myApp.readParameters("How many numbers? ");
        String password = "";
        for(String characters : (makePass.randomPass(length, numSpecial, numInts))){
            password += characters;
        };
        System.out.println("Your password is " + password);
    }
    public int readParameters(String prompt){
        System.out.print(prompt);
        while (true) {
            try {
                return inp.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer input");
                inp.nextLine();
            }
        }
    }
}