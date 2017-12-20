/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Room;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class RoomBizImpl implements RoomBiz{
       //引入dao
    BaseDao rdao = new BaseDao();

    @Override
    public boolean add(Room r) {
        String sql = "insert into t_room values(?,?,?,?,?)";
        Object[] params ={r.getRid(),r.getRname(),r.getRcounttable(),r.getRcondition(),1};
	return rdao.update(sql,params);    
    }

    @Override
    public boolean delete(int rid) {
        String sql = "update t_room set state =0 where rid = ?";
	//传递参数
	Object[] params = {rid};
	return rdao.update(sql, params);
    }

    @Override
    public boolean update(Room r) {
        String sql = "update t_room  set rname=?,rcounttable=?,rcondition=? where rid = ?";
	Object[] params ={r.getRname(),r.getRcounttable(),r.getRcondition(),r.getRid()};
	return rdao.update(sql, params);
    }

    @Override
    public Room findByID(int rid) {
        String sql = "select *from t_room where rid = ? and rstate = 1";
	Object[] params = {rid};	
	return (Room)rdao.get(sql, Room.class, params);
    }

    @Override
    public List<Room> findAll() {
        String sql = "select *from t_room where rstate = 1";
	return rdao.query(sql, Room.class);
    }
    public List<Room> findByCondition(String conditions) {
        String sql = "select * from t_room where rstate=1 ";
        if(conditions !=null && conditions.length()>0){
            sql +=" and rname) like '%"+conditions+"%'";
        }
        return rdao.query(sql, Room.class);
    }
}
