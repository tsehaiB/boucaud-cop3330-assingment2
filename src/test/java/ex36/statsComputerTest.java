package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.lang.Math;
import static org.junit.jupiter.api.Assertions.*;

class statsComputerTest {

    @Test
    void findMax_returns_9876_given_1_2_9876() {
        //given
        statsComputer compute = new statsComputer();
        ArrayList<Double> data = new ArrayList<>();
        data.add(1.0);
        data.add(2.0);
        data.add(9876.0);
        //when
        int expected = 9876;
        int actual = (int) compute.findMax(data);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findMin_returns_1_given_1_2_9876() {
        //given
        statsComputer compute = new statsComputer();
        ArrayList<Double> data = new ArrayList<>();
        data.add(1.0);
        data.add(2.0);
        data.add(9876.0);
        //when
        int expected = 1;
        int actual = (int) compute.findMin(data);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findAvg_returns_5_given_0_5_10() {
        //given
        statsComputer compute = new statsComputer();
        ArrayList<Double> data = new ArrayList<>();
        data.add(0.0);
        data.add(5.0);
        data.add(10.0);
        //when
        int expected = 5;
        int actual = (int) compute.findAvg(data);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void findStd_returns_353_given_100_200_1000_300() {
        //given
        statsComputer compute = new statsComputer();
        ArrayList<Double> data = new ArrayList<>();
        data.add(100.0);
        data.add(200.0);
        data.add(1000.0);
        data.add(300.0);
        //when (Using Ceil to approximate)
        double expected = Math.ceil(353.55);
        double actual = Math.ceil(compute.findStd(data, compute.findAvg(data)));
        //then
        assertEquals(expected, actual);
    }
}