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
public class Employee {
    int eid;//员工id
    String ename;//员工姓名
    String esex;//员工性别
    int eage;//员工年龄
    double ewage;//员工工资
    String ephone;//员工联系方式
    int etype;//员工身份，1服务员，2厨师，3采购员
    //state,员工状态，0销毁，1工作，2休假

    public Employee() {
    }

    public Employee(int eid, String ename, String esex, int eage, double ewage, String ephone, int etype) {
        this.eid = eid;
        this.ename = ename;
        this.esex = esex;
        this.eage = eage;
        this.ewage = ewage;
        this.ephone = ephone;
        this.etype = etype;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public double getEwage() {
        return ewage;
    }

    public void setEwage(double ewage) {
        this.ewage = ewage;
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone;
    }

    public int getEtype() {
        return etype;
    }

    public void setEtype(int etype) {
        this.etype = etype;
    }
    
    
}
    

