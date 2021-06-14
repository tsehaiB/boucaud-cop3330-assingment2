/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex38;
import ex38.filterer;
import java.util.InputMismatchException;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ex37.App myApp = new ex37.App();
        filterer onlyEven = new filterer();
        ArrayList<Integer> numbers = onlyEven.readNum();
        numbers = onlyEven.filterList(numbers);

        System.out.print("The even numbers are");
        for(int num : numbers){
            System.out.print(" " + num);
        }
        System.out.println(".");
    }
}