/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex36;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class statsComputer {
    private static final Scanner inp = new Scanner(System.in);
    public double readData(){
        System.out.print("Enter a number: ");
        while (true) {
            try {
                if(inp.hasNext("done")) {
                    inp.nextLine();
                    return 123456789.987654321;
                }
                double n = inp.nextDouble();
                return n;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a numerical input");
                inp.nextLine();
            }
        }
    }
    public ArrayList<Double> listData(){
        ArrayList<Double> data = new ArrayList<>();
        do {
            double temp = readData();
            if (temp == 123456789.987654321) {
                if(data.isEmpty())
                    continue;
                else
                    break;
            }
            else
                data.add(temp);
        } while (true);
        return data;
    }
    public void printRawData(ArrayList<Double> data){
        String out = "Numbers: ";
        for(double num : data){
            out += num + ", ";
        }
        System.out.println(out);
    }
    public double findMax(ArrayList<Double> data){
        double max = data.get(0);
        for(double num : data)
        {
            if(num > max)
                max = num;
        }
        return max;
    }
    public double findMin(ArrayList<Double> data){
        double min = data.get(0);
        for(double num : data)
        {
            if(num < min)
                min = num;
        }
        return min;
    }
    public double findAvg(ArrayList<Double> data){
        double avg = 0.0;
        for(double num : data)
        {
            avg += num;
        }
        return avg/((double) data.size());
    }
    public double findStd(ArrayList<Double> data, double avg){
        double std = 0.0;
        for(double num : data){
            std += Math.pow((num-avg), 2);
        }
        std /= ((double) data.size());
        return Math.sqrt(std);
    }

}
