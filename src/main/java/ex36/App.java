/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */

package ex36;
import ex36.statsComputer;

import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        ex36.App myApp = new ex36.App();

        statsComputer compute = new statsComputer();
        ArrayList<Double> data = compute.listData();

        compute.printRawData(data);
        myApp.printStats("average", compute.findAvg(data));
        myApp.printStats("minimum", compute.findMin(data));
        myApp.printStats("maximum", compute.findMax(data));
        myApp.printStats("standard deviation", compute.findStd(data, compute.findAvg(data)));

    }
    private void printStats(String type, double n){
        String printNum = String.format("%.2f", n);
        System.out.println("The " + type + " is " + printNum);
    }
}