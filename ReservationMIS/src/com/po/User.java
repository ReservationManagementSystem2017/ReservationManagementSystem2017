/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.po;

/**
 *  
 * @author lin xiangpeng
 */
public class User {
    private Integer uid;
    private String uname;
    private String password;
    private Integer eid;
    private String permission;

    public User() {
    }

    public User(Integer uid, String uname, String password, Integer eid, String permission) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.eid = eid;
        this.permission = permission;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    
    
	
    
}
