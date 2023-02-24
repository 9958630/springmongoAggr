package com.springmongo.springmongoAggr.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "account")
public class Account {
    @Id
    public String id;
    public String accountName;
    public String accountType;
    public Integer amount;
    public String accountAddr;
    public Date currentTs;
}
