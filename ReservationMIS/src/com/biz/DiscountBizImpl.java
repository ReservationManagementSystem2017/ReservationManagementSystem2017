/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Discount;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DiscountBizImpl implements DiscountBiz{
       //引入dao
    BaseDao edao = new BaseDao();
    
    public boolean add(Discount d) {
        String sql = "insert into t_discount values(?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, d.getDtype(),d.getDiscountrate(),d.getDmeetmoney(),d.getDreducemoney()};
        return edao.update(sql, params);
    }

    public boolean delete(int did) {
        //软删除操作
        String sql = "update t_discount set dstate = 0 where did = ?";
        Object[] params = {did};
        return edao.update(sql, params);
    }

    public boolean update(Discount d) {
         String sql = "update t_discount set dtype=?,discountrate=?,dmeetmoney=?,dreducemoney=? where did = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {d.getDtype(),d.getDiscountrate(),d.getDmeetmoney(),d.getDreducemoney(),d.getDid()};
        return edao.update(sql, params);
    }

    public Discount findByID(int did) {
        String sql = "select * from t_discount where did=? and dstate = 1";
        Object[] params = {did};
        return (Discount) edao.get(sql, Discount.class, params);

    }

    public List<Discount> findAll() {
        String sql = "select * from t_discount where dstate = 1";
        return edao.query(sql, Discount.class);
    }
}
