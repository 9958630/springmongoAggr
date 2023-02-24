package com.springmongo.springmongoAggr.controller;

import com.springmongo.springmongoAggr.Service.AccountService;
import com.springmongo.springmongoAggr.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/saveAccount")
    public ResponseEntity<String> saveAccountDetails(@RequestBody Account account){
        if (Objects.nonNull(account)){
            String message = accountService.saveAccountDetails(account);
            return new ResponseEntity<>(message, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Input request Invalid please provide proper request",HttpStatus.BAD_REQUEST);

    }
}
