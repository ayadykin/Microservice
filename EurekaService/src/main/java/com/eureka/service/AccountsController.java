package com.eureka.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @RequestMapping("/service/account")
    public String byNumber() {
        return "Account microservice ";

    }

}
