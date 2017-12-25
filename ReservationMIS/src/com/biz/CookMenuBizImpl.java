/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.CookMenu;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CookMenuBizImpl implements CookMenuBiz{
       //引入dao
    BaseDao edao = new BaseDao();
    
    public boolean add(CookMenu cm) {
        String sql = "insert into t_cook_menu values(?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, cm.getEid(),cm.getMid()};
        return edao.update(sql, params);
    }

    public boolean delete(int cmid) {
        //软删除操作
        String sql = "update t_cook_menu set cmstate = 0 where cmid = ?";
        Object[] params = {cmid};
        return edao.update(sql, params);
    }

    public boolean update(CookMenu cm) {
         String sql = "update t_cook_menu set eid=?,mid=?  where cmid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {cm.getEid(),cm.getMid(),cm.getCmid()};
        return edao.update(sql, params);
    }

    public CookMenu findByID(int cmid) {
        String sql = "select * from t_cook_menu where cmid=? and cmstate = 1";
        Object[] params = {cmid};
        return (CookMenu) edao.get(sql, CookMenu.class, params);

    }

    public List<CookMenu> findAll() {
        String sql = "select * from t_cook_menu where cmstate = 1";
        return edao.query(sql, CookMenu.class);
    }
    
   public List<CookMenu> isRepetion(int eid, int mid)
   {
        String sql = "select * from t_cook_menu where eid=? and mid = ? and cmstate = 1";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {eid,mid};
        return edao.query(sql, CookMenu.class,params);
   }
}
