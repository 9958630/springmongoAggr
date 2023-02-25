package com.springmongo.springmongoAggr.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "account")
public class Account {
    @Id
    public String id;
    public String accountNumber;
    public String accountName;
    public String accountType;
    public Integer amount;
    public String accountAddr;
    public Date currentTs;
    public Integer max;


    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAccountAddr() {
        return accountAddr;
    }

    public void setAccountAddr(String accountAddr) {
        this.accountAddr = accountAddr;
    }

    public Date getCurrentTs() {
        return currentTs;
    }

    public void setCurrentTs(Date currentTs) {
        this.currentTs = currentTs;
    }
}
