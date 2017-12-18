/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.User;
import java.util.List;

/**
 *
 * @author lin xiangpeng
 */
public class UserBizImpl implements UserBiz {

    //引入dao
    BaseDao udao = new BaseDao();

    public boolean add(User u) {
        String sql = "insert into t_user values(?,?,?,?,?,?)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, u.getUname(), u.getPassword(), u.getEid(), u.getPermission(), 1};
        return udao.update(sql, params);
    }

    public boolean delete(int uid) {
        //软删除操作
        String sql = "update t_user set state = 0 where uid = ?";
        Object[] params = {uid};
        return udao.update(sql, params);
    }

    public boolean updatePassword(Integer uid,String newPassword) {
        String sql = "update t_user set password =? where uid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {newPassword,uid};
        return udao.update(sql, params);
    }

    public boolean updateEid(User u) {
        String sql = "update t_user set eid =? where uid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {u.getPassword(), u.getUid()};
        return udao.update(sql, params);
    }

    public boolean updatePermission(User u) {
        String sql = "update t_user set permission =? where uid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {u.getPassword(), u.getUid()};
        return udao.update(sql, params);
    }

    public User findByID(int uid) {
        String sql = "select * from t_user where uid=? and ustate = 1";
        Object[] params = {uid};
        return (User) udao.get(sql, User.class, params);

    }

    //查找账号
    public User findByUsername(String uname) {
        String sql = "select * from t_user where uname=? and ustate = 1";
        Object[] params = {uname};
        return (User) udao.get(sql, User.class, params);
    }

    //查找员工ID
    public User findByEmpid(int eid) {
        String sql = "select * from t_user where eid=? and ustate = 1";
        Object[] params = {eid};
        return (User) udao.get(sql, User.class, params);
    }

    public List<User> findAll() {
        String sql = "select * from t_user where ustate = 1";
        return udao.query(sql, User.class);
    }

    public List<User> findByCondition(String condition) {
        String sql = "select * from t_user where ustate = 1";
        if (condition.length() > 0) {
            sql += " and concat(username) like '%" + condition + "%'";
        }
        return udao.query(sql, User.class);
    }

}
