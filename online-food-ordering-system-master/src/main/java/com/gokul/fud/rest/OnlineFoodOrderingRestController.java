package com.gokul.fud.rest;

import com.gokul.fud.domain.Restaurant;
import com.gokul.fud.domain.RestaurantRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineFoodOrderingRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
