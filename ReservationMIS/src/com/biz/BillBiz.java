/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Bill;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface BillBiz {
     // 1 增加账单
    public boolean add(Bill b);

    // 2 删除账单
    public boolean delete(int bid);

    // 3 修改账单
    public boolean update(Bill b);

    // 4 根据编号查找账单
    public Bill findByID(int bid);

    // 5 查询所有账单
    public List<Bill> findAll();


}
