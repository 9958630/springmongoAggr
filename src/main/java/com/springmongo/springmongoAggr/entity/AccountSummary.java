package com.springmongo.springmongoAggr;

import java.util.Date;

public class AccountSummary {
    private Date accCreateTs;
    private String primaryName;
    private String email;

    public Date getAccCreateTs() {
        return accCreateTs;
    }

    public void setAccCreateTs(Date accCreateTs) {
        this.accCreateTs = accCreateTs;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
