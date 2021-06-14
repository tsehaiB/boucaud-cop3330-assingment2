
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex26;
import java.lang.Math;
public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(int b, double apr, int p){
            double i = apr/360.0;
            double number = 1 - Math.pow((1 + i), 30);
            number *= b/(p * 1.0);
            number += 1;
            number = Math.log(number) * -(1/30.0);
            number /= Math.log(1 + i);
            return (int)Math.ceil(number);
    }
}
