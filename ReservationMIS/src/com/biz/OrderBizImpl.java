/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Order;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class OrderBizImpl implements OrderBiz{
       //引入dao
    BaseDao edao = new BaseDao();
    
    
    public boolean add(Order o) {
        String sql = "insert into t_orders values(?,?,?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, o.getCid(),o.getOpopulation(),o.getOtime(),o.getEid(),o.getTid(),o.getRid()};
        return edao.update(sql, params);
    }

    public boolean delete(int oid) {
        //软删除操作
        String sql = "update t_orders set ostate = 0 where oid = ?";
        Object[] params = {oid};
        return edao.update(sql, params);
    }

    public boolean update(Order o) {
         String sql = "update t_orders set cid=?,opopulation=?,otime=?,eid=?,tid=?,rid=? where oid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {o.getCid(),o.getOpopulation(),o.getOtime(),o.getEid(),o.getTid(),o.getRid(),o.getOid()};
        return edao.update(sql, params);
    }

    public Order findByID(int oid) {
        String sql = "select * from t_orders where oid=? and ostate = 1";
        Object[] params = {oid};
        return (Order) edao.get(sql, Order.class, params);

    }

    public List<Order> findAll() {
        String sql = "select * from t_orders where ostate = 1";
        return edao.query(sql, Order.class);
    }
    
    public Order findLastOne()
    {
         String sql = "select * from t_orders order by oid desc limit 1 ";
         Object[] params = {};
         return (Order) edao.get(sql, Order.class, params);
    }
    
//    public double getTotalPrice(int oid)
//    {
//        String sql = "select sum(odcount*mprice) from t_orderdishes INNER JOIN t_menu on t_orderdishes.mid = t_menu.mid where oid =? ";
//        Object[] params = {oid};
//        return (Double) edao.get(sql, Double.class, params);
//    }
    public Order findFinishedByID(int oid)
    {
        String sql = "select * from t_orders where oid=?";
        Object[] params = {oid};
        return (Order) edao.get(sql, Order.class, params);
    }
}
