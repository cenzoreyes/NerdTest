package com.nat.change.controllers;

import com.nat.change.bsuinessLogic.Calculator;
import com.nat.change.dataAccess.models.Request;
import com.nat.change.dataAccess.models.Coins;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cenzo
 * @version 1.0
 * @since 2019-10-15
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MakeChange {

    /**
     * The main API endpoint for the back end of the change calculation app. This POST endpoint will be used by an
     * Angular web app to request a list of coin values and quantities required to sum a given dollar amount. The
     * dollar amount is passed the the JSON body as a Request object.
     *
     * @param request an object containing the dollar amount change will be calculated for.
     * @return a Coins object that will contain initial amount and the minimum number of coins needed.
     */
    @PostMapping(path = "/coincalc", consumes = "application/JSON", produces = "application/JSON")
    public Coins makeChange (@RequestBody Request request) {
        //Instantiate a new Calculator, make change, and return the Coins object
        return new Calculator().makeChange(request);
    }
}
