/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import java.util.List;
import com.po.Customer;

/**
 *
 * @author Administrator
 */
public interface CustomerBiz {
     // 1 增加客户
    public boolean add(Customer c);

    // 2 删除客户
    public boolean delete(int cusid);

    // 3 修改客户
    public boolean update(Customer c);

    // 4根据编号查找客户
    public Customer findByID(int cusid);

    // 5查询所有客户
    public List<Customer> findAll();

    // 6模糊查询
    public List<Customer> findByCondition(String condition);

    // 增加积分
    public boolean addScore(int cid,double score);
    
}
