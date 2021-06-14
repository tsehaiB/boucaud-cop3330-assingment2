/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex25;

import ex25.passwordStrength;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        ex25.App myApp = new ex25.App();
        String myPass = myApp.readStr();
        passwordStrength validate = new passwordStrength();
        int strength = validate.passwordValidator(myPass);
        myApp.output(myPass, myApp.chooseStr(myPass, strength));
    }
    private String readStr(){
        System.out.print("Type in a password to test its strength: ");
        return inp.nextLine();
    }
    private void output(String pass, String str){
        System.out.println("The password '" + pass + "' is a " + str + " password.");
    }
    private String chooseStr(String pass, int strength){
        switch (strength){
            case 1: {
                return "very weak";
            }
            case 2:{
                return "weak";
            }
            case 3:{
                return "strong";
            }
            case 4: {
                return "very strong";
            }
        }
        return "very weak";
    }
}