package com.springmongo.springmongoAggr.mapper;

import com.springmongo.springmongoAggr.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN, componentModel = "spring")
public interface AccountMapper {

    Account mapModelToEntity(com.springmongo.springmongoAggr.model.Account account);
}
