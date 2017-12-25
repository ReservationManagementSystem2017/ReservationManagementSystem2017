/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Menu;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MenuBizImpl implements MenuBiz {

    //引入dao

    BaseDao edao = new BaseDao();

    public boolean add(Menu m) {
        String sql = "insert into t_menu values(?,?,?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, m.getMname(), m.getMtype(), m.getMprice(), m.getMcooktime(), m.getMstorage(),
            m.getMcount()};
        return edao.update(sql, params);
    }

    public boolean delete(int mid) {
        //软删除操作
        String sql = "update t_menu set mstate = 0 where mid = ?";
        Object[] params = {mid};
        return edao.update(sql, params);
    }

    public boolean update(Menu m) {
        String sql = "update t_menu set mname=?,mtype=?,mprice=?,mcooktime=?,mstorage=?,mcount=? where mid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {m.getMname(), m.getMtype(), m.getMprice(), m.getMcooktime(), m.getMstorage(),
            m.getMcount(), m.getMid()};
        return edao.update(sql, params);
    }

    public Menu findByID(int mid) {
        String sql = "select * from t_menu where mid=? and mstate = 1";
        Object[] params = {mid};
        return (Menu) edao.get(sql, Menu.class, params);

    }

    public List<Menu> findAll() {
        String sql = "select * from t_menu where mstate = 1";
        return edao.query(sql, Menu.class);
    }

    public List<Menu> findByCondition(String condition) {
        String sql = "select * from t_menu where mstate = 1";
        if (condition.length() > 0) {
            sql += " and concat(mname,mtype) like '%" + condition + "%'";
        }
        return edao.query(sql, Menu.class);
    }

    public Menu findByMid(int mid) {
        String sql = "select * from t_menu where mid = ?";
        Object[] params = {mid};

        return (Menu) edao.get(sql, Menu.class, params);
    }

    public boolean addMstorage(int mid, int number) {
        String sql = "update t_menu set mstorage = mstorage + ?  where mid = ?";
        Object[] params = {number, mid};
        return edao.update(sql, params);
    }

    public boolean reduceMstorage(int mid, int number) {
        String sql = "update t_menu set mstorage = mstorage - ?  where mid = ?";
        Object[] params = {number, mid};
        return edao.update(sql, params);
    }

    public List<Menu> findByConditionBaseStorage(String condition) {
        String sql = "select * from t_menu where mstate = 1 and mstorage!=0";
        if (condition.length() > 0) {
            sql += " and concat(mname,mtype) like '%" + condition + "%'";
        }
        return edao.query(sql, Menu.class);
    }
    
   
}
