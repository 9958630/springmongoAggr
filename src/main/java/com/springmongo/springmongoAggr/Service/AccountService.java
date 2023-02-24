package com.springmongo.springmongoAggr.Service;

import com.springmongo.springmongoAggr.DAO.AccountDAO;
import com.springmongo.springmongoAggr.mapper.AccountMapper;
import com.springmongo.springmongoAggr.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AccountService {
    private AccountDAO accountDAO;

    private AccountMapper accountMapperImpl;
    @Autowired
    public AccountService(AccountDAO accountDAO, AccountMapper accountMapperImpl) {
        this.accountDAO = accountDAO;
        this.accountMapperImpl = accountMapperImpl;
    }

    public String saveAccountDetails(Account account) {
        com.springmongo.springmongoAggr.entity.Account accountentity = accountMapperImpl.mapModelToEntity(account);
        com.springmongo.springmongoAggr.entity.Account accountdao = accountDAO.save(accountentity);
        if(Objects.nonNull(accountdao)){
            return "Given record inserted successfully in mongoDB";
        }
        return null;
    }

}
