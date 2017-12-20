/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Order;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface OrderBiz {
    
     // 1 增加订单
    public boolean add(Order o);

    // 2 删除订单
    public boolean delete(int oid);

    // 3 修改订单
    public boolean update(Order o);

    // 4 根据编号查找订单
    public Order findByID(int oid);

    // 5 查询所有订单
    public List<Order> findAll();

  //查找最后一条数据
    public Order findLastOne();
}
