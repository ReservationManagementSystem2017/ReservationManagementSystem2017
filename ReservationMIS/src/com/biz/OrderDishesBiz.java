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
 
    // 4 根据编号查找已点的具体菜,包括状态被销毁的
    public OrderDishes findAllByID(int odid);
    
    // 5 查询所有已点的具体菜
    public List<OrderDishes> findAll();
    
    //根据OID和相应的状态去寻找所有的菜品记录
    public List<OrderDishes> findByOid(int oid, int state);
    
    //根据OID去寻找所有的菜品记录
    public List<OrderDishes> findByOid(int oid);
    
     //根据OID去寻找所有的菜品记录非零
    public List<OrderDishes> findByOidNot0(int oid);
    
   //查找已经做好的菜
    public List<OrderDishes> findFinshed();
    
    //上菜，把状态从3变成4
    public boolean Shangcai(OrderDishes od);
    
     //取消菜，把状态从2变成1
    public boolean Quxiaocai(int odid);
    
    //做菜，把状态从1变成2
    public boolean Zuocai(int odid);
    
    //完成菜，把状态从2变成3
    public boolean Wanchengcai(int odid);
    
    //根据员工ID找到所有要做的菜，即所有odstate的状态为1的菜
    public List<OrderDishes> toCookByEid(int eid);
    
    //根据员工ID找到所有正在煮的菜，即所有odstate的状态为2的菜
    public List<OrderDishes> cookingByEid(int eid);
    
    //根据菜单编号查找昨天的所有点的菜
    public List<OrderDishes> findYesterdayByMid(String time,int mid);
    
}
