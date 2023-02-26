package com.springmongo.springmongoAggr.entity;

public class Employee {

    private String id;
    private String empName;
    private String empAddr;
    private String empEmailID;
    private String empMobNumber;
    private String empFatherName;
    private String companyName;
    private Integer salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddr() {
        return empAddr;
    }

    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }

    public String getEmpEmailID() {
        return empEmailID;
    }

    public void setEmpEmailID(String empEmailID) {
        this.empEmailID = empEmailID;
    }

    public String getEmpMobNumber() {
        return empMobNumber;
    }

    public void setEmpMobNumber(String empMobNumber) {
        this.empMobNumber = empMobNumber;
    }

    public String getEmpFatherName() {
        return empFatherName;
    }

    public void setEmpFatherName(String empFatherName) {
        this.empFatherName = empFatherName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
