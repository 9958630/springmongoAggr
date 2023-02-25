package com.springmongo.springmongoAggr.DAO;

import com.springmongo.springmongoAggr.entity.Account;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDAO extends MongoRepository<Account,String> {

    @Aggregation(pipeline = {
            "{$match:{accountType:?0,accountName:{$ne:null}}}",
            "{$count:'accountName'}"
    })
    Integer getAllAccountByType(String accountType);

    List<Account> findByAccountNumber(String accountNumber);

    @Aggregation(pipeline = {
            "{$match:{accountName:?0,amount:{'$gt':5000},accountType:'Saving'}}",
            "{$sort:{currentTs:-1}}"
    })
    List<Account> getAccountName(String name);

    @Aggregation(pipeline = {
            "{$sort:{currentTs:-1}}",
            "{$skip:?1}",
            "{$limit:?0}"
    })
    List<Account> fetchAllAccounts(Integer limit, Integer skip);

    @Aggregation(pipeline = {
            "{$group:{_id:$accountType,max:{$max:'$amount'}}}"
    })
    List<Account> getMaxAmount();

    @Aggregation(pipeline = {
            "{$group:{_id:$accountType,max:{$min:'$amount'}}}"
    })
    List<Account> getMinAmount();
}
