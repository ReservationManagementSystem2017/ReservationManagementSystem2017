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
public class OrderDishes {
    private Integer odid;//点菜id
    private Integer oid;//订单id
    private Integer mid;//菜单id
    private Integer odcount;//菜品数量
    private String odtime;//点餐时间

    public OrderDishes() {
    }

    public OrderDishes(Integer odid, Integer oid, Integer mid, Integer odcount, String odtime) {
        this.odid = odid;
        this.oid = oid;
        this.mid = mid;
        this.odcount = odcount;
        this.odtime = odtime;
    }

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getOdcount() {
        return odcount;
    }

    public void setOdcount(Integer odcount) {
        this.odcount = odcount;
    }

    public String getOdtime() {
        return odtime;
    }

    public void setOdtime(String odtime) {
        this.odtime = odtime;
    }
    
    

    
    
}
