package com.springmongo.springmongoAggr;

import java.util.Date;

public class Transactions {

    private Date createTs;
    private Date modifyTs;
    private Integer processAmt;
    private String status;

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public Date getModifyTs() {
        return modifyTs;
    }

    public void setModifyTs(Date modifyTs) {
        this.modifyTs = modifyTs;
    }

    public Integer getProcessAmt() {
        return processAmt;
    }

    public void setProcessAmt(Integer processAmt) {
        this.processAmt = processAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
