/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
class filtererTest {

    @Test
    void filterList_returns_without_odd_numbers() {
        //given
        filterer myList = new filterer();
        ArrayList<Integer> myNumbers = new ArrayList<>();
        for(int i = 0; i < 10000; i++)
        {
            myNumbers.add(i);
        }
        myNumbers = myList.filterList(myNumbers);
        //when
        boolean expected = true;
        for(int num : myNumbers){
            if((num % 2) != 0){
                expected = false;
                break;
            }
        }
        //then
        assertTrue(expected);
    }
}