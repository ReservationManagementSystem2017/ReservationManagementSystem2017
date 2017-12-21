/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Table;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TableBiz {
      // 1 增加桌子
    public boolean add(Table t);

    // 2 删除桌子
    public boolean delete(int tid);

    // 3 修改桌子
    public boolean update(Table t);

    // 4 根据编号查找桌子
    public Table findByID(Integer tid);

    // 5 查询所有桌子
    public List<Table> findAll();
    
    // 5 查询所有状态空闲的桌子
    public List<Table> findEmpty();
}
