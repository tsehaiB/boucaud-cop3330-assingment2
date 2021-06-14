/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex35;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class lottery {
    private static final Scanner inp = new Scanner(System.in);
    public String readName(){
        System.out.print("Enter a name: ");
        return inp.nextLine();
    }
    public int generateNum(int max){
        Random rand = new Random(max);
        return rand.nextInt(max);
    }
    public ArrayList<String> makeList() {
        ArrayList<String> names = new ArrayList<>();
        do {
            String temp = readName();
            if (temp.equals("")) {
                if(names.isEmpty())
                    continue;
                else
                    break;
            }
            else
                names.add(temp);
        } while (true);
        return names;
    }
    public String chooseName(ArrayList<String> list, int num){
        return list.get(num);
    }
}
