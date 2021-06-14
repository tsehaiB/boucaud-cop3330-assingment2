/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex34;
import ex34.employees;

import java.util.Scanner;
public class App {
    private static final Scanner inp = new Scanner(System.in);
    private static final employees database = new employees();
    public static void main(String[] args) {
        ex34.App myApp = new ex34.App();

        String[] list = database.baseList();
        int remaining = database.countString(list);
        //print defaults
        myApp.printAll(list, remaining);

        String name = myApp.readName();
        System.out.println("");
        //find name to remove

        list = database.removeEmployee(name, list);
        remaining = database.countString(list);
        //reassignments

        myApp.printAll(list, remaining);
        //new output
    }
    private void printAll(String[] list, int remaining){
        database.printCount(remaining);
        String names = database.writeNames(list);
        database.printNames(names);
    }
    private String readName(){
        System.out.println("");
        System.out.print("Enter an employee name to remove: ");
        return inp.nextLine();
    }
}