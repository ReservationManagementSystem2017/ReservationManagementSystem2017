/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;
import com.po.Room;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface RoomBiz {
        //1.增加房间
	public boolean  add(Room r);
	//2.删除房间
	public boolean  delete(int rid);
	//3.修改房间
	public boolean  update (Room r);
	//4.根据条件查找房间
	public Room findByID(int rid);
	//5.查询所有房间
	public List<Room> findAll();
	//6.模糊查询
        public List<Room> findByCondition(String conditions);
	/*public List<Product> findByCondition (String condition);
        public List<Product> findByCondition(String conditions,String type,Integer proid);*/

}

