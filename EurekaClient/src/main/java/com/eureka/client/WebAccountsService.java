package com.eureka.client;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Yadykin Andrii Nov 23, 2016
 *
 */
@Service
public class WebAccountsService {

    protected Logger logger = Logger.getLogger(WebAccountsService.class.getName());

    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;

    public String getAccount() {
        logger.info("getAccount");
        String resp;
        try {
            resp = restTemplate.getForObject("http://ACCOUNTS-SERVICE/AccountService/service/account", String.class);

        } catch (RestClientException e) {
            resp = e.getMessage();
        }

        return resp;
    }

}
