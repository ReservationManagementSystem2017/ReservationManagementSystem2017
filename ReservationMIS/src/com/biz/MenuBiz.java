/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Menu;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface MenuBiz {
    
      // 1 增加菜单
    public boolean add(Menu m);

    // 2 删除菜单
    public boolean delete(int mid);

    // 3 修改菜单
    public boolean update(Menu m);

    // 4 根据编号查找菜单
    public Menu findByID(int mid);

    // 5 查询所有菜单
    public List<Menu> findAll();

    // 6 菜单姓名模糊查询
    public List<Menu> findByCondition(String condition);
    public Menu findByMid(int mid);

}
