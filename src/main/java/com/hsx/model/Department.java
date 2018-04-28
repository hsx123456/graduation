package com.hsx.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xing on 18/3/27.
 */
public class Department implements Serializable{

    private Integer id;
    //部门名
    private String deptName;
    //部门所有员工
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(Integer id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


}
