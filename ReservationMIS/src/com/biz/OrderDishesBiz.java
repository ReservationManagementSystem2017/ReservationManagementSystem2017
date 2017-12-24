/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.OrderDishes;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface OrderDishesBiz {
     // 1 增加已点的具体菜
    public boolean add(OrderDishes od);

    // 2 删除已点的具体d
    public boolean delete(int odid);

    // 3 修改已点的具体菜
    public boolean update(OrderDishes od);

    // 4 根据编号查找已点的具体菜
    public OrderDishes findByID(int odid);

    // 5 查询所有已点的具体菜
    public List<OrderDishes> findAll();
    
    //根据OID和相应的状态去寻找所有的菜品记录
    public List<OrderDishes> findByOid(int oid, int state);
    
    //根据OID和相应的状态去寻找所有的菜品记录
    public List<OrderDishes> findByOid(int oid);
    
   //查找已经做好的菜
    public List<OrderDishes> findFinshed();
    
    //上菜
    public boolean Shangcai(OrderDishes od);
    
    
    public boolean Zuocai(int odid);
    
    public boolean Wanchengcai(int odid);
    
    public List<OrderDishes> findByEid(int state ,int eid);
    
    //根据菜单编号查找昨天的所有点的菜
    public List<OrderDishes> findYesterdayByMid(String time,int mid);
    
}
