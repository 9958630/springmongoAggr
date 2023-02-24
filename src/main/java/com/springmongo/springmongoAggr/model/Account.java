package com.springmongo.springmongoAggr.model;

import java.util.Date;

public class Account {
    public String id;
    public String accountName;
    public String accountType;
    public Integer amount;
    public String accountAddr;
    public Date currentTs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
