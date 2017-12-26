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
public class Table {
    private Integer tid;//餐桌id
    private Integer rid;//房间id
    private Integer tseat;//座位数量
    private Integer tcondition;//使用情况 1为未被使用，0为已被使用
    //state,0销毁，1存在

    public Table() {
    }

    public Table(Integer tid, Integer rid, Integer tseat, Integer tcondition) {
        this.tid = tid;
        this.rid = rid;
        this.tseat = tseat;
        this.tcondition = tcondition;
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

    public Integer getTseat() {
        return tseat;
    }

    public void setTseat(Integer tseat) {
        this.tseat = tseat;
    }

    public Integer getTcondition() {
        return tcondition;
    }

    public void setTcondition(Integer tcondition) {
        this.tcondition = tcondition;
    }
    
    
    
    
   
}
