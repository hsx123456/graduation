package com.hsx.service;

import com.github.pagehelper.PageInfo;
import com.hsx.model.Employee;

import java.util.List;

/**
 * Created by xing on 18/3/29.
 */
public interface EmployeeService {
    //添加一个员工
    Employee addEmployee(Employee employee);
    //根据id获取一个员工
    Employee getEmpById(Integer id);
    //根据部门id获取员工
    List<Employee> getEmpsBydeptId(Integer did);
    //查询所有员工
    List<Employee> getEmpAll();
    //根据根据分页查询
    PageInfo<Employee> getEmpByPage(Integer pn);
    //根据手机号查询员工
    Employee getEmpsByMobile(String mobile);
    //更新员工
    void updateEmp(Employee employee);
    //修改员工密码
    void updatePasswd(Employee employee);
    //根据id删除员工
    void deleteEmpById(Integer id);
    //多个id删除
    void deleteBatch(List<Integer> ids);

}
