package com.nat.change.dataAccess.models;

public class Coins {

    private double amount;
    private int silverDollar;
    private int halfDollar;
    private int quarter;
    private int dime;
    private int nickel;
    private int penny;


    public Coins() {
    }

    public Coins (double amount) {
        this.amount = amount;
    }

    public Coins (double amount, int[] arr) {
        this.amount = amount;
        this.silverDollar = arr[0];
        this.halfDollar = arr[1];
        this.quarter = arr[2];
        this.dime = arr[3];
        this.nickel = arr[4];
        this.penny = arr[5];
    }

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
