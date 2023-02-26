package com.springmongo.springmongoAggr.controller;

import com.springmongo.springmongoAggr.Service.AccountService;
import com.springmongo.springmongoAggr.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("/getAccountName")
    public ResponseEntity<List<Account>> getAccountName(@RequestParam("name")String name){
        return new ResponseEntity<>(accountService.getAccountName(name),HttpStatus.OK);
    }

    @GetMapping("/getAllAccountCountBasedAccountType")
    public ResponseEntity<Integer> getAccountCountByAccType(@RequestParam("count")String accountType){
        return new ResponseEntity<>(accountService.getAccCountByAccType(accountType),HttpStatus.OK);
    }

    @GetMapping("/getAllAccounts")
    public ResponseEntity<List<Account>> getAllAccount(@RequestParam("limit")Integer limit,
                                                       @RequestParam("skip")Integer skip){
        return new ResponseEntity<>(accountService.getAllAccount(limit,skip),HttpStatus.OK);
    }

    @GetMapping("/getMaxAndMinAmount")
    public ResponseEntity<List<Account>> getMaxAndMinAmount(@RequestParam("flag")String flag){
        return new ResponseEntity<>(accountService.getMaxAndMinAmount(flag),HttpStatus.OK);
    }

    @GetMapping("/getAccountSumAndAvg")
    public ResponseEntity<List<Account>> getAccountSumAndAvg(@RequestParam("flag")String flag){
        return new ResponseEntity<>(accountService.getAccountSumAndAvg(flag),HttpStatus.OK);
    }

    @GetMapping("/getAccAndEmployeeDetails")
    public ResponseEntity<List<Account>> getAccAndEmpDetails(){
        return new ResponseEntity<>(accountService.getAccAndEmpDetails(),HttpStatus.OK);
    }

    @PatchMapping("/updateAccount")
    public ResponseEntity<String> updateAccountDetails(@RequestBody Account account){
        if(Objects.nonNull(account)){
            String message = accountService.updateAccount(account);
            if(message.contains("Updated successfully")) {
                return new ResponseEntity<>(accountService.updateAccount(account),HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity <>(message, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
}
