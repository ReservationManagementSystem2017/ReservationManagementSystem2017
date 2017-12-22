/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Bill;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class BillBizImpl implements BillBiz  {
     //引入dao
    BaseDao edao = new BaseDao();
    
    
    public boolean add(Bill b) {
        String sql = "insert into t_bill values(?,?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, b.getBmoney(),b.getCid(),b.getEid(),b.getBtime(),b.getBinvoice()};
        return edao.update(sql, params);
    }

    public boolean delete(int bid) {
        //软删除操作
        String sql = "update t_bill set bstate = 0 where bid = ?";
        Object[] params = {bid};
        return edao.update(sql, params);
    }

    public boolean update(Bill b) {
         String sql = "update t_bill set bmoney=?,cid=?,eid=?,btime=?,binvoice=? where bid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {b.getBmoney(),b.getCid(),b.getEid(),b.getBtime(),b.getBinvoice(),b.getBid()};
        return edao.update(sql, params);
    }

    public Bill findByID(int bid) {
        String sql = "select * from t_bill where bid=? and bstate = 1";
        Object[] params = {bid};
        return (Bill) edao.get(sql, Bill.class, params);

    }

    public List<Bill> findAll() {
        String sql = "select * from t_bill where bstate = 1";
        return edao.query(sql, Bill.class);
    }
    
    public List<Bill> findByCid(int cid)
    {
        String sql = "select * from t_bill where bstate = 1 and cid=?";
        Object[] params = {cid};
        return edao.query(sql, Bill.class, params);
    }
    
   
    public List<Bill> findByEid(int eid)
    {
        String sql = "select * from t_bill where bstate = 1 and eid=?";
        Object[] params = {eid};
        return edao.query(sql, Bill.class, params);
    }
    
}
