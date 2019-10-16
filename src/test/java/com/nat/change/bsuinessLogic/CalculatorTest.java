package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.Request;
import com.nat.change.dataAccess.models.Coins;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Cenzo
 * @version 1.0
 * @since 2019-10-16
 */
public class CalculatorTest {

    /**
     * Test a one dollar value.
     */
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

    /**
     * Test a larger value to ensure minimum change is given.
     */
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

    /**
     * Test a very small value that deals in sub dollar coins only.
     */
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

    /**
     * test a 99 cent value, to check for rounding errors.
     */
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

    /**
     * Test to ensure a zero value returns no coins.
     */
    @Test
    public void TestMakeChangeZero() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(00.00);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getNickel(), c.getPenny()};
        int[] expected = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }

    /**
     * Test to ensure a negative value does not return negative coins.
     */
    @Test
    public void TestMakeChangeNegative() {
        Calculator calc = new Calculator();
        Request req = new Request();
        req.setAmount(-33.55);
        Coins c = calc.makeChange(req);
        int[] actual = {c.getSilverDollar(), c.getHalfDollar(), c.getQuarter(), c.getDime(), c.getNickel(), c.getPenny()};
        int[] expected = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, actual);
    }
}