package com.eureka.client;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAccountsController {

    @Autowired
    protected WebAccountsService accountsService;

    protected Logger logger = Logger.getLogger(WebAccountsController.class.getName());

    @GetMapping("/accounts")
    public String goHome() {
        return accountsService.getAccount();
    }

}
