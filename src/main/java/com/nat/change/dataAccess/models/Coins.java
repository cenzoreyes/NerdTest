package com.nat.change.dataAccess.models;

public class Coins {

    private double amount;
    private int silverDollar;
    private int halfDollar;
    private int quarter;
    private int dime;
    private int nickel;
    private int penny;
    private int arr[];

    public Coins() {
    }

    public Coins (double amount, int[] arr) {
        this.amount = amount;
        this.arr = arr;
    }

//    public Coins (double amount, int[] arr, int silverDollar, int halfDollar, int quarter, int dime, int nickel, int penny) {
//        this.amount = amount;
//        this.silverDollar = silverDollar;
//        this.halfDollar = halfDollar;
//        this.quarter = quarter;
//        this.dime = dime;
//        this.nickel = nickel;
//        this.penny = penny;
//        this.arr = arr;
//    }

    public int getSilverDollar() {
        return silverDollar;
    }

    public double getAmount() {
        return amount;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
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
