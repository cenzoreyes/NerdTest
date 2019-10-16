package com.nat.change.dataAccess.models;

/**
 * @author Cenzo
 * @version 1.0
 * @since 2019-10-15
 */
public class Request {
    /*
    The only variable of this object. A double value which is used to store a dollar amount.
     */
    private double amount;

    /**
     * The request object that is used to map data received from an API POST request made from the Angular front end.
     * a numeric value is received and mapped to the amount value contained within this object.There is only one value
     * contained within this object, but an object is still implemented for the sake of following common practices,
     * future scalability, and ease of maintenance.
     */
    public Request() {
    }

    /*
    All getters and setters are contained below. There is no special behavior.
     */

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
