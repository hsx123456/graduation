package com.hsx.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsx.mapper.EmployeeMapper;
import com.hsx.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xing on 18/3/29.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee addEmployee(Employee employee) {
        Employee employee1 = employee;
        Integer integer=employeeMapper.addEmployee(employee1);
        if (integer!=null&&integer.intValue()>0){
            return employee1;
        }
        return null;
    }

    public Employee getEmpById(Integer id) {
        return employeeMapper.getEmpById(id);
    }

    public List<Employee> getEmpsBydeptId(Integer did) {
        return employeeMapper.getEmpsBydeptId(did);
    }

    public List<Employee> getEmpAll() {
        return employeeMapper.getEmpAll();
    }

    public PageInfo<Employee> getEmpByPage(Integer pn) {

        PageHelper.startPage(pn,5);
        List<Employee> employees=employeeMapper.getEmpAll();
        PageInfo<Employee> pageInfo=new PageInfo<Employee>(employees,5);
        return pageInfo;
    }


    public Employee getEmpsByMobile(String mobile) {
        return employeeMapper.getEmpsByMobile(mobile);
    }

    public void updateEmp(Employee employee) {
        employeeMapper.updateEmp(employee);
    }

    public void updatePasswd(Employee employee) {
        employeeMapper.updatePasswd(employee);
    }

    public void deleteEmpById(Integer id) {
        employeeMapper.deleteEmpById(id);
    }

    public void deleteBatch(List<Integer> ids) {
        employeeMapper.deleteBatch(ids);
    }


}
