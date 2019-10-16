package com.nat.change.controllers;

import com.nat.change.dataAccess.models.ChangeRequest;
import com.nat.change.dataAccess.models.Coins;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinCalc {

    @PostMapping(path = "/coincalc", consumes = "application/JSON", produces = "application/JSON")
    public Coins makeChange (@RequestBody ChangeRequest changeRequest) {

        return new CoinCalc().makeChange(changeRequest);
    }

    @GetMapping(path = "/hello")
    public String hello () {
        return "Hello world";
    }
}
