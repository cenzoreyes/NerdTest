package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.dataAccess.models.Coins;

public class Calculator {

    public Coins makeChange(ChangeRequest request) {
        double value = request.getAmount();
        double changeValue = 0;
        int[] change = new int[6];
        double[] coinVals = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        if (value == 0) {
            return new Coins();
        } else {
            do {
                for (int i = 0; i < coinVals.length; i++) {
                    int x = (int) (value / coinVals[i]);
                    change[i] = x;
                    value -= x * coinVals[i];
                }
            } while (value != 0);
            return new Coins(value, change);
        }
    }
}