/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.CookMenu;
import java.util.List;

/**
 * 厨师和菜单的联系
 * @author Administrator
 */
public interface CookMenuBiz {
    // 1 增加厨师和菜单的联系
    public boolean add(CookMenu cm);

    // 2 删除厨师和菜单的联系
    public boolean delete(int cmid);

    // 3 修改厨师和菜单的联系
    public boolean update(CookMenu cm);

    // 4 根据编号查找厨师和菜单的联系
    public CookMenu findByID(int cmid);

    // 5 查询所有厨师和菜单的联系
    public List<CookMenu> findAll();
}
