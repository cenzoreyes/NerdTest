package com.nat.change.bsuinessLogic;

import com.nat.change.dataAccess.models.Request;
import com.nat.change.dataAccess.models.Coins;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Cenzo
 * @version 1.0
 * @since 2019-10-15
 */
public class Calculator {

    /**
     * The main change calculation method for the application. This method will consume a Request object, and use the
     * information stored in that object, to calculate how many silver dollars, half dollars, quarters, dimes, nickels,
     * and pennies are required to represent the specified dollar value in coins. This algorithm assigns quantities in
     * a descending order (silver dollars first, then half dollars, etc.) in an effort to return the minimum amount of
     * coins needed. Most of the variables instantiated and used in this method are of the type BigDecimal. This
     * complicates mathematical operations, but is necessary whenever financial calculations are executed to retain data
     * integrity and avoid introducing errors due to rounding.
     *
     * @param request an object containing the dollar amount change will be calculated for.
     * @return a new Coins object that will contain initial amount and the minimum number of coins needed
     */
    public Coins makeChange(Request request) {

        //Declare a BigDecmial variable to store the dollar amount passed in the change request
        BigDecimal value = new BigDecimal(request.getAmount()).setScale(2, RoundingMode.HALF_UP);

        //Create a new array that will be used to store the amount of each coin required to comprise the dollar amount
        int[] change = new int[6];

        //Instantiate a BigDecimal array to store the coin values
        BigDecimal[] coinVals = {new BigDecimal("1"),new BigDecimal("0.5"),new BigDecimal("0.25"),
                new BigDecimal("0.1"),new BigDecimal("0.05"),new BigDecimal("0.01")};

        //Check if the request's dollar amount is zero or negative and exit the calculator if so (backend input control)
        if (value.equals(0) || value.doubleValue() < 0) {
            return new Coins(request.getAmount(), change);
        }
        /*
        This is where the coin calculation occurs - Loop through the array of coin values and use a simulated integer
        division to see how many coins of each value can be subtracted from the dollar amount. Subtract the sum of the
        coins from the dollar amount, store the quantity of coins in the change array, move to the next position of the
        coin value array, and repeat. This is done until the end of the array is reached. Then, return a new Coins
        object with the original dollar value, and change array.
         */
        else {
                for (int i = 0; i < coinVals.length; i++) {
                    BigDecimal x = value.divide(coinVals[i], 0, BigDecimal.ROUND_DOWN);
                    change[i] = x.intValue();
                    value = value.subtract(x.multiply(coinVals[i]));
                }
            return new Coins(request.getAmount(), change);
        }
    }
}