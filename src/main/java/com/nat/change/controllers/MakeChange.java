package com.nat.change.controllers;

import com.nat.change.bsuinessLogic.Calculator;
import com.nat.change.dataAccess.models.Request;
import com.nat.change.dataAccess.models.Coins;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeChange {

    @PostMapping(path = "/coincalc", consumes = "application/JSON", produces = "application/JSON")
    public Coins makeChange (@RequestBody Request request) {

        return new Calculator().makeChange(request);
    }

    @GetMapping(path = "/hello")
    public String hello () {
        return "Hello world";
    }
}
