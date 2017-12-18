/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.User;
import java.util.List;

/**
 * 用户业务接口
 *
 * @author lin xiangpeng
 */
public interface UserBiz {

    // 1 增加用户

    public boolean add(User u);

    // 2 删除用户
    public boolean delete(int uid);

    // 3 修改用户密码
    public boolean updatePassword(Integer uid,String newPassword);

    //修改用户员工编号

    public boolean updateEid(User u);

    //修改用户权限
    public boolean updatePermission(User u);

    // 4根据编号查找用户
    public User findByID(int uid);

    //查找账号
    public User findByUsername(String uname);

    //查找员工ID
    public User findByEmpid(int eid);

    // 5查询所有用户
    public List<User> findAll();

    // 6模糊查询
    public List<User> findByCondition(String condition);

}
