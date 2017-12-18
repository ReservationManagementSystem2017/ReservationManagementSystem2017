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
public class Room {
    private Integer rid;//房间id
    private Integer rcounttable;//房间餐桌数
    private Integer rcondition;//房间使用情况

    public Room() {
    }

    public Room(Integer rid, Integer rcounttable, Integer rcondition) {
        this.rid = rid;
        this.rcounttable = rcounttable;
        this.rcondition = rcondition;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRcounttable() {
        return rcounttable;
    }

    public void setRcounttable(Integer rcounttable) {
        this.rcounttable = rcounttable;
    }

    public Integer getRcondition() {
        return rcondition;
    }

    public void setRcondition(Integer rcondition) {
        this.rcondition = rcondition;
    }
    
    
    
    
    
}
