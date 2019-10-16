package com.nat.change.dataAccess.models;

/**
 * @author Cenzo
 * @version 1.0
 * @since 2019-10-15
 */
public class Coins {

    /** The dollar amount consumed in the API POST request */
    private double amount;
    /** Quantity of silver dollars in the amount */
    private int silverDollar;
    /** Quantity of half dollars in the amount */
    private int halfDollar;
    /** Quantity of quarters in the amount */
    private int quarter;
    /** Quantity of dimes in the amount */
    private int dime;
    /** Quantity of nickels in the amount */
    private int nickel;
    /** Quantity of pennies in the amount */
    private int penny;

    /**
     * The coins object that is used to store the dollar amount passed into the API's POST request, and the quantities
     * of each coin requires to sum the specified dollar amount. This will be mapped to a JSON object and returned as a
     * POST response to the Angular front end. Note the constructor consumes an array and maps the array's individual
     * values to each respective coin, in descending order of monetary value.
     *
     * @param amount The dollar amount consumed in the API POST request
     * @param arr An array containing six values which represent coin quantities
     */
    public Coins (double amount, int[] arr) {
        this.amount = amount;
        this.silverDollar = arr[0];
        this.halfDollar = arr[1];
        this.quarter = arr[2];
        this.dime = arr[3];
        this.nickel = arr[4];
        this.penny = arr[5];
    }

    /*
    All getters and setters are contained below. There is no special behavior.
     */

    public int getSilverDollar() {
        return silverDollar;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSilverDollar(int silverDollar) {
        this.silverDollar = silverDollar;
    }

    public int getHalfDollar() {
        return halfDollar;
    }

    public void setHalfDollar(int halfDollar) {
        this.halfDollar = halfDollar;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getDime() {
        return dime;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }

    public int getNickel() {
        return nickel;
    }

    public void setNickel(int nickel) {
        this.nickel = nickel;
    }

    public int getPenny() {
        return penny;
    }

    public void setPenny(int penny) {
        this.penny = penny;
    }
}
