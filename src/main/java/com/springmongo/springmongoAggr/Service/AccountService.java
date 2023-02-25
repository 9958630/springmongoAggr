package com.springmongo.springmongoAggr.Service;

import com.springmongo.springmongoAggr.DAO.AccountDAO;
import com.springmongo.springmongoAggr.mapper.AccountMapper;
import com.springmongo.springmongoAggr.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
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

    public String updateAccount(Account account) {
        List<com.springmongo.springmongoAggr.entity.Account> accountList = accountDAO.findByAccountNumber
                (account.getAccountNumber());
        if(!CollectionUtils.isEmpty(accountList) && accountList.size()>1){
            return "Given accountNumber we found duplications please contact with your bank...!";
        }
        if(!CollectionUtils.isEmpty(accountList) && accountList.size()<=1){
            account.setId(accountList.stream().findFirst().get().getId());
            com.springmongo.springmongoAggr.entity.Account accountObj = accountDAO.save(
                    accountMapperImpl.mapModelToEntity(account));
            if(Objects.nonNull(accountObj)){
                return "Updated successfully";
            }
        }
        return "Given accountNumber not found in database";

    }

    public List<Account> getAccountName(String name) {
        return accountMapperImpl.listEntityTOModel(accountDAO.getAccountName(name));
    }

    public Integer getAccCountByAccType(String accountType) {
        return accountDAO.getAllAccountByType(accountType);
    }

    public List<Account> getAllAccount(Integer limit, Integer skip) {
        return accountMapperImpl.listEntityTOModel(accountDAO.fetchAllAccounts(limit,skip));
    }

    public List<Account> getMaxAndMinAmount(String flag) {

        if(flag.equalsIgnoreCase("Max")){
            return accountMapperImpl.listEntityTOModel(accountDAO.getMaxAmount());
        }else{
            return accountMapperImpl.listEntityTOModel(accountDAO.getMinAmount());
        }

    }
}
