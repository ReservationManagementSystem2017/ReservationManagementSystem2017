/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Discount;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DiscountBiz {
    
     // 1 增加打折规则
    public boolean add(Discount d);

    // 2 删除打折规则
    public boolean delete(int did);

    // 3 修改打折规则
    public boolean update(Discount d);

    // 4 根据编号查找打折规则
    public Discount findByID(int did);

    // 5 查询所有打折规则
    public List<Discount> findAll();

  
}
