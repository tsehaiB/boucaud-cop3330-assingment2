/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeesTest {


    @Test
    void removeEmployee_returns_edited_list_given_name() {
        //given
        employees database = new employees();

        //when
        String[] list = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", null, "Jeremy Goodwin"};
        String[] actual = database.removeEmployee("Amanda Cullen", list);

        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void countString_ignores_nulls_when_counting_names() {
        //given
        employees database = new employees();

        //when
        String[] list = {"John Smith", null, "Jackie Jackson", null, "Chris Jones", null, "Amanda Cullen", "Jeremy Goodwin"};
        int expected = 5;
        int actual = database.countString(list);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void writeNames_ignores_nulls_when_writing_names(){
        //given
        employees database = new employees();

        //when
        String[] list = {"John Smith", null, "Jackie Jackson", null, "Chris Jones", null, "Amanda Cullen", "Jeremy Goodwin"};
        String expected = "John Smith\n" +
                "Jackie Jackson\n" +
                "Chris Jones\n" +
                "Amanda Cullen\n" +
                "Jeremy Goodwin";
        String actual = database.writeNames(list);

        //then
        assertEquals(expected, actual);
    }
}