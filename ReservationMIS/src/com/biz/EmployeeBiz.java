/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.po.Employee;
import java.util.List;

/**
 * Employee 职工业务接口
 * @author Administrator
 */

public interface EmployeeBiz {
    
    // 1 增加职工
    public boolean add(Employee e);

    // 2 删除职工
    public boolean delete(int eid);

    // 3 修改职工
    public boolean update(Employee e);

    // 4 根据编号查找职工
    public Employee findByID(int eid);

    // 5 查询所有职工
    public List<Employee> findAll();

    // 6 职工姓名模糊查询
    public List<Employee> findByCondition(String condition);
     public List<Employee> findByCook( );

}
