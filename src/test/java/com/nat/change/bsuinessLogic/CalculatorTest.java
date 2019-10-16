package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.bsuinessLogic.Calculator;
import com.nat.change.dataAccess.models.Coins;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testMakeChange1() {
        Calculator calc = new Calculator();
        ChangeRequest req = new ChangeRequest();
        req.setAmount(1);
        int[] actual = calc.makeChange(req).getArr();
        int[] expected = {1,0,0,0,0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestMakeChange2() {
        Calculator calc = new Calculator();
        ChangeRequest req = new ChangeRequest();
        req.setAmount(32.40);
        int[] actual = calc.makeChange(req).getArr();
        int[] expected = {32,0,1,1,1,0};
        assertArrayEquals(expected, actual);
    }
}