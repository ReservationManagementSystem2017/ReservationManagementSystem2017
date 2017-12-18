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
public class Customer {
    private Integer cid;//顾客id
    private String cname;//顾客姓名
    private double cscore;//顾客积分
    private String cphone;//顾客手机号

    public Customer() {
    }

    public Customer(Integer cid, String cname, double cscore, String cphone) {
        this.cid = cid;
        this.cname = cname;
        this.cscore = cscore;
        this.cphone = cphone;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getCscore() {
        return cscore;
    }

    public void setCscore(double cscore) {
        this.cscore = cscore;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }
    
    
    
}
