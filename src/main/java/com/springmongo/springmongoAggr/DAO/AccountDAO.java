package com.springmongo.springmongoAggr.DAO;

import com.springmongo.springmongoAggr.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends MongoRepository<Account,String> {

}
