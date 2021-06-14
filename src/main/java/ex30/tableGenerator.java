/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex30;

public class tableGenerator {
    public String table(){
        String t = "";
        for(int i = 1; i < 13; i++)
        {
            for(int j = 1; j < 13; j++){
                t += String.format("%5d", i*j);
            }
            if(i < 12)
                t += "\n";
        }
        return t;
    }
}
