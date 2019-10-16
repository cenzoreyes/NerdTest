package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.bsuinessLogic.Calculator;
import com.nat.change.dataAccess.models.Coins;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void makeChange() {
        ChangeRequest req = new ChangeRequest();
        req.setAmount(1);
        Calculator calc = new Calculator();
        int[] actual = calc.makeChange(req).getArr();
        int[] expected = {1,0,0,0,0,0};
        assertArrayEquals(expected, actual);
    }
}