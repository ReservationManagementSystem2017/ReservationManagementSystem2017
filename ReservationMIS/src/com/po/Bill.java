/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.po;

/**
 *
 * @author Administrator
 */
public class Bill {
    private Integer bid;//账单id
    private double bmoney;//消费金额
    private Integer cid;//顾客id
    private Integer eid;//服务员id
    private String btime;//结账时间
    private Boolean binvoice;//是否开发票

    public Bill() {
    }

    public Bill(Integer bid, double bmoney, Integer cid, Integer eid, String btime, Boolean binvoice) {
        this.bid = bid;
        this.bmoney = bmoney;
        this.cid = cid;
        this.eid = eid;
        this.btime = btime;
        this.binvoice = binvoice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public double getBmoney() {
        return bmoney;
    }

    public void setBmoney(double bmoney) {
        this.bmoney = bmoney;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public Boolean getBinvoice() {
        return binvoice;
    }

    public void setBinvoice(Boolean binvoice) {
        this.binvoice = binvoice;
    }
    
    
    
}
