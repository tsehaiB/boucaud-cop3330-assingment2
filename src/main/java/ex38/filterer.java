/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex38;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class filterer {
    private static final Scanner inp = new Scanner(System.in);
    public ArrayList<Integer> readNum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = inp.nextLine();
        String[] allNums = input.split(" ");
        for(String num : allNums){
            numbers.add(Integer.parseInt(num));
        }
        return numbers;
    }
    public ArrayList<Integer> filterList(ArrayList<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            if((numbers.get(i) % 2) == 1){
                numbers.remove(i);
            }
        }
        return numbers;
    }

    public void printList(ArrayList<Integer> list){

    }
}
