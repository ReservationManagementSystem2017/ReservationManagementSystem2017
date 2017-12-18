/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.po;

/**
 *厨师能做什么菜
 * @author Administrator
 */
public class CookMenu {
    private Integer cmid;//id
    private Integer eid;//厨师id
    private Integer mid;//具体菜品id

    public CookMenu() {
    }

    public CookMenu(Integer cmid, Integer eid, Integer mid) {
        this.cmid = cmid;
        this.eid = eid;
        this.mid = mid;
    }

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
    
    
    
    
}
