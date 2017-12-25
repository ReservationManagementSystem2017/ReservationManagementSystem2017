/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.OrderDishes;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class OrderDishesBizImpl implements OrderDishesBiz {

    //引入dao
    BaseDao edao = new BaseDao();

    public boolean add(OrderDishes od) {
        String sql = "insert into t_orderdishes values(?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, od.getOid(), od.getMid(), od.getOdcount(), od.getOdtime()};
        return edao.update(sql, params);
    }

    public boolean delete(int odid) {
        //软删除操作
        String sql = "update t_orderdishes set odstate = 0 where odid = ?";
        Object[] params = {odid};
        return edao.update(sql, params);
    }

    public boolean update(OrderDishes od) {
        String sql = "update t_orderdishes set oid=?,mid=?,odcount=?,odtime=? where odid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {od.getOid(), od.getMid(), od.getOdcount(), od.getOdtime(), od.getOid()};
        return edao.update(sql, params);
    }

    public OrderDishes findByID(int odid) {
        String sql = "select * from t_orderdishes where odid=? and odstate = 1";
        Object[] params = {odid};
        return (OrderDishes) edao.get(sql, OrderDishes.class, params);

    }

    public OrderDishes findAllByID(int odid) {
        String sql = "select * from t_orderdishes where odid=?";
        Object[] params = {odid};
        return (OrderDishes) edao.get(sql, OrderDishes.class, params);
    }

    public List<OrderDishes> findAll() {
        String sql = "select * from t_orderdishes where odstate = 1";
        return edao.query(sql, OrderDishes.class);
    }

    //查找已经做好的菜
    public List<OrderDishes> findFinshed() {
        String sql = "select * from t_orderdishes where odstate=2";
        return edao.query(sql, OrderDishes.class);
    }

    public List<OrderDishes> findByOid(int oid) {
        String sql = "select * from t_orderdishes where oid = ?";
        Object[] params = {oid};
        return edao.query(sql, OrderDishes.class, params);

    }

    public List<OrderDishes> findByOid(int oid, int state) {
        String sql = "select * from t_orderdishes where oid = ? and odstate = ?";
        Object[] params = {oid, state};
        return edao.query(sql, OrderDishes.class, params);

    }

    public List<OrderDishes> findByOidNot0(int oid) {
        String sql = "select * from t_orderdishes where oid = ? and odstate !=0";
        Object[] params = {oid};
        return edao.query(sql, OrderDishes.class, params);

    }

    //上菜
    public boolean Shangcai(OrderDishes od) {

        String sql = "update t_orderdishes set odstate = 4 where odid =  ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {od.getOdid()};
        return edao.update(sql, params);
    }

    public boolean Quxiaocai(int odid) {
        String sql = "update t_orderdishes set odstate = 1 where odid =  ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {odid};
        return edao.update(sql, params);
    }

    public boolean Zuocai(int odid) {
        String sql = "update t_orderdishes set odstate = 2 where odid =  ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {odid};
        return edao.update(sql, params);
    }

    public boolean Wanchengcai(int odid) {

        String sql = "update t_orderdishes set odstate = 3 where odid =  ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {odid};
        return edao.update(sql, params);

    }

    public List<OrderDishes> toCookByEid(int eid) {

        String sql = "SELECT * FROM t_orderdishes WHERE odstate = 1 AND EXISTS(SELECT * FROM t_cook_menu WHERE eid = ? AND t_orderdishes.mid=t_cook_menu.mid)";
        Object[] params = {eid};
        return edao.query(sql, OrderDishes.class, params);
    }

    public List<OrderDishes> cookingByEid(int eid) {

        String sql = "SELECT * FROM t_orderdishes WHERE odstate = 2 AND EXISTS(SELECT * FROM t_cook_menu WHERE eid = ? AND t_orderdishes.mid=t_cook_menu.mid)";
        Object[] params = {eid};
        return edao.query(sql, OrderDishes.class, params);
    }

    public List<OrderDishes> findYesterdayByMid(String time, int mid) {
        String sql = "select * from t_orderdishes where odstate = 1 and mid = ?";
        if (time.length() > 0) {
            sql += " and concat(odtime) like '%" + time + "%'";
        }
        Object[] params = {mid};
        return edao.query(sql, OrderDishes.class, params);
    }

}
