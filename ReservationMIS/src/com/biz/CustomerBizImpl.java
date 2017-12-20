/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Customer;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CustomerBizImpl implements CustomerBiz{
       //引入dao
    BaseDao cdao = new BaseDao();
    public boolean add(Customer c) {
        String sql = "insert into t_customer values(?,?,?,?, 1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, c.getCname(), c.getCscore(),c.getCphone()};
        return cdao.update(sql, params);
    }

    public boolean delete(int supid) {
        //软删除操作
        String sql = "update t_customer set cstate = 0 where cid = ?";
        Object[] params = {supid};
        return cdao.update(sql, params);
    }

    public boolean update(Customer c) {
         String sql = "update t_customer set cname=?,cscore=?,cphone=?  where cid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        /*Object[] params = {c.getCusname(), c.getCustbid(), c.getCusphone(), c.getCustel(),
            c.getCusaddr(), c.getCuspostcode(), c.getCusid()};*/
         Object[] params={c.getCname(),c.getCscore(),c.getCphone(),c.getCid()};
        return cdao.update(sql, params);
    }

    public Customer findByID(int cusid) {
        String sql = "select * from t_customer where cid=? and cstate = 1";
        Object[] params = {cusid};
        return (Customer) cdao.get(sql, Customer.class, params);

    }

    public List<Customer> findAll() {
        String sql = "select * from t_customer where cstate = 1";
        return cdao.query(sql, Customer.class);
    }

    public List<Customer> findByCondition(String condition) {
        String sql = "select * from t_customer where cstate = 1";
        if (condition.length() > 0) {
            sql += " and concat(cname) like '%" + condition + "%'";
        }
        return cdao.query(sql, Customer.class);
    }
   
}

