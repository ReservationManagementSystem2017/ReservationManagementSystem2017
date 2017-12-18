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
public class Discount {
    private Integer did;//打折id
    private Integer dtype;//折扣类型
    private double discountrate;//打折力度
    private double dmeetmoney;//满多少
    private double dreducemoney;//减多少

    public Discount() {
    }

    public Discount(Integer did, Integer dtype, double discountrate, double dmeetmoney, double dreducemoney) {
        this.did = did;
        this.dtype = dtype;
        this.discountrate = discountrate;
        this.dmeetmoney = dmeetmoney;
        this.dreducemoney = dreducemoney;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public double getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(double discountrate) {
        this.discountrate = discountrate;
    }

    public double getDmeetmoney() {
        return dmeetmoney;
    }

    public void setDmeetmoney(double dmeetmoney) {
        this.dmeetmoney = dmeetmoney;
    }

    public double getDreducemoney() {
        return dreducemoney;
    }

    public void setDreducemoney(double dreducemoney) {
        this.dreducemoney = dreducemoney;
    }
    
    

}
