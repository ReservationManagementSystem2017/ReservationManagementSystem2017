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
public class Menu {
    private Integer mid;//菜单id
    private String mname;//菜种名称
    private String mtype;//菜种类型
    private double mprice;//菜种价格
    private Integer mcooktime;//做菜时间
    private Integer mcount;//点菜次数
    //state，0销毁，1存在

    public Menu() {
    }

    public Menu(Integer mid, String mname, String mtype, double mprice, Integer mcooktime, Integer mcount) {
        this.mid = mid;
        this.mname = mname;
        this.mtype = mtype;
        this.mprice = mprice;
        this.mcooktime = mcooktime;
        this.mcount = mcount;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public double getMprice() {
        return mprice;
    }

    public void setMprice(double mprice) {
        this.mprice = mprice;
    }

    public Integer getMcooktime() {
        return mcooktime;
    }

    public void setMcooktime(Integer mcooktime) {
        this.mcooktime = mcooktime;
    }

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
    }
    
    
}
