/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Room;
import com.po.Table;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class RoomBizImpl implements RoomBiz{
       //引入dao
    BaseDao edao = new BaseDao();
    
    public boolean add(Room r) {
        String sql = "insert into t_room values(?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, r.getRcounttable(),r.getRcondition()};
        return edao.update(sql, params);
    }

    public boolean delete(int rid) {
        //软删除操作
        String sql = "update t_room set rstate = 0 where rid = ?";
        Object[] params = {rid};
        return edao.update(sql, params);
    }

    public boolean update(Room r) {
         String sql = "update t_room set rcounttable=?,rcondition=? where rid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {r.getRcounttable(),r.getRcondition(),r.getRid()};
        return edao.update(sql, params);
    }

    public Room findByID(int rid) {
        String sql = "select * from t_room where rid=? and rstate = 1";
        Object[] params = {rid};
        return (Room) edao.get(sql, Room.class, params);

    }

    public List<Room> findAll() {
        String sql = "select * from t_room where rstate = 1";
        return edao.query(sql, Room.class);
    }
    
    
      public List<Room> findByRcondition() {
        String sql = "select * from t_room where rstate = 1 and rcondition = 1";
        return edao.query(sql, Table.class);
    }
}
