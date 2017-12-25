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
public class Order {
    private Integer oid;//订单id
    private Integer opopulation;//用餐人数
    private String otime;//下单时间
    private Integer eid;//服务员id
    private Integer tid;//餐桌id
    private Integer rid;//房间id

    public Order() {
    }

    public Order(Integer oid, Integer opopulation, String otime, Integer eid, Integer tid, Integer rid) {
        this.oid = oid;
        this.opopulation = opopulation;
        this.otime = otime;
        this.eid = eid;
        this.tid = tid;
        this.rid = rid;
    }

   

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }


    public Integer getOpopulation() {
        return opopulation;
    }

    public void setOpopulation(Integer opopulation) {
        this.opopulation = opopulation;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    
    
    
    
}
