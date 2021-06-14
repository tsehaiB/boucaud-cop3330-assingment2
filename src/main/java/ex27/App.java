/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex27;
import ex27.inputValidator;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        ex27.App myApp = new ex27.App();

        String firstName = myApp.readStr("first name") ;
        String lastName = myApp.readStr("last name") ;
        String zipCode = myApp.readStr("ZIP code") ;
        String employeeID = myApp.readStr("employee ID") ;

        inputValidator validate = new inputValidator();

        String output = validate.validateInput(firstName, lastName, zipCode, employeeID);

        myApp.printOut(output);
    }
    private String readStr(String prompt){
        System.out.print("Enter the " + prompt + ": ");
        return inp.nextLine();
    }
    private void printOut(String str){
        if(str == "")
            System.out.println("There were no errors found.");
        else
            System.out.println(str);
    }
}