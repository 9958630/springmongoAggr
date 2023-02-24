package com.springmongo.springmongoAggr.DAO;

import com.springmongo.springmongoAggr.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDAO extends MongoRepository<Account,String> {

    List<Account> findByAccountNumber(String accountNumber);
}
