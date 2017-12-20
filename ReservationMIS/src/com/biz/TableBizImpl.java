/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Table;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TableBizImpl implements TableBiz{
       //引入dao
    BaseDao edao = new BaseDao();
    
    public boolean add(Table t) {
        String sql = "insert into t_tables values(?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, t.getRid(),t.getTseat(),t.getTcondition()};
        return edao.update(sql, params);
    }

    public boolean delete(int tid) {
        //软删除操作
        String sql = "update t_tables set tstate = 0 where tid = ?";
        Object[] params = {tid};
        return edao.update(sql, params);
    }

    public boolean update(Table t) {
         String sql = "update t_tables set rid=?,tseat=?,tcondition=? where tid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {t.getRid(),t.getTseat(),t.getTcondition(),t.getTid()};
        return edao.update(sql, params);
    }

    public Table findByID(int tid) {
        String sql = "select * from t_tables where tid=? and tstate = 1";
        Object[] params = {tid};
        return (Table) edao.get(sql, Table.class, params);

    }

    public List<Table> findAll() {
        String sql = "select * from t_tables where tstate = 1";
        return edao.query(sql, Table.class);
    }
    
     public List<Table> findByTcondition() {
        String sql = "select * from t_tables where tstate = 1 and tcondition = 1";
        return edao.query(sql, Table.class);
    }
}
