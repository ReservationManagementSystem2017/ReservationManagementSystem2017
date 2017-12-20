/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import com.dao.BaseDao;
import com.po.Employee;
import java.util.List;

/**
 * 职工信息业务实现
 * @author Administrator
 */
public class EmployeeBizImpl implements EmployeeBiz{
    //引入dao
    BaseDao edao = new BaseDao();

    public boolean add(Employee e) {
        String sql = "insert into t_employee values(?,?,?,?,?,?,?,1)";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {null, e.getEname(), e.getEsex(), e.getEage(), e.getEwage(),
            e.getEphone(), e.getEtype()};
        return edao.update(sql, params);
    }

    public boolean delete(int eid) {
        //软删除操作
        String sql = "update t_employee set estate = 0 where eid = ?";
        Object[] params = {eid};
        return edao.update(sql, params);
    }

    public boolean update(Employee e) {
         String sql = "update t_employee set ename=?,esex=?,eage=?,ewage=?,ephone=?,etype=? where eid = ?";
        //params中的参数是按顺序逐个给？赋值，所以需要注意数据表顺序
        Object[] params = {e.getEname(), e.getEsex(), e.getEage(), e.getEwage(),
            e.getEphone(), e.getEtype(), e.getEid()};
        return edao.update(sql, params);
    }

    public Employee findByID(int eid) {
        String sql = "select * from t_employee where eid=? and estate = 1";
        Object[] params = {eid};
        return (Employee) edao.get(sql, Employee.class, params);

    }

    public List<Employee> findAll() {
        String sql = "select * from t_employee where estate = 1";
        return edao.query(sql, Employee.class);
    }

    public List<Employee> findByCondition(String condition) {
        String sql = "select * from t_employee where estate = 1";
        if (condition.length() > 0) {
            sql += " and concat(ename) like '%" + condition + "%'";
        }
        return edao.query(sql, Employee.class);
    }
}
