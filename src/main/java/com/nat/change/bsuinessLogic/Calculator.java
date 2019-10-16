package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.dataAccess.models.Coins;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public Coins makeChange(ChangeRequest request) {
        BigDecimal value = new BigDecimal(request.getAmount()).setScale(2, RoundingMode.HALF_UP);
        int[] change = new int[6];
        BigDecimal[] coinVals = {new BigDecimal("1"),new BigDecimal("0.5"),new BigDecimal("0.25"),
                new BigDecimal("0.1"),new BigDecimal("0.05"),new BigDecimal("0.01")};

        if (value.equals(0) || value.doubleValue() < 0) {
            return new Coins(request.getAmount());
        } else {
                for (int i = 0; i < coinVals.length; i++) {
                    BigDecimal x = value.divide(coinVals[i], 0, BigDecimal.ROUND_DOWN);
                    change[i] = x.intValue();
                    value = value.subtract(x.multiply(coinVals[i]));
                }
            return new Coins(request.getAmount(), change);
        }
    }
}