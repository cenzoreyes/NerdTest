package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.dataAccess.models.Coins;

public class Calculator {

    public Coins makeChange (ChangeRequest request) {



        Coins coins = new Coins(request.getAmount(), 1, 2, 3, 4, 5, 6);

        return coins;
    }
}
