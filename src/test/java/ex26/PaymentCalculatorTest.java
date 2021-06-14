/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_returns_70_when_5000_12_100() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        int expected = 70;
        int actual = calc.calculateMonthsUntilPaidOff(5000, 0.12, 100);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void calculateMonthsUntilPaidOff_returns_526_when_99_12_1() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        int expected = 526;
        int actual = calc.calculateMonthsUntilPaidOff(99, 0.12, 1);

        //then
        assertEquals(expected, actual);
    }
    @Test
    void calculateMonthsUntilPaidOff_returns_1_when_1_01_999() {
        //given
        PaymentCalculator calc = new PaymentCalculator();

        //when
        int expected = 1;
        int actual = calc.calculateMonthsUntilPaidOff(1, .01, 999);

        //then
        assertEquals(expected, actual);
    }
}