package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.Request;
import com.nat.change.dataAccess.models.Coins;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testMakeChange1() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(1);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getDime(), c.getPenny()};
        int[] expected = {1,0,0,0,0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMakeChange2() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(32.40);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getDime(), c.getPenny()};
        int[] expected = {32,0,1,1,1,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMakeChange3() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(0.69);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getDime(), c.getPenny()};
        int[] expected = {0,1,0,1,1,4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMakeChange4() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(10.99);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getNickel(), c.getPenny()};
        int[] expected = {10,1,1,2,0,4};
        assertArrayEquals(expected, actual);
    }
}