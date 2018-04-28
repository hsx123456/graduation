package com.hsx.model;

import com.hsx.type.EmpType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by xing on 18/3/28.
 * 员工
 */
public class Employee implements Serializable{

    private Integer id;
    //员工姓名
    private String name;
    //员工年龄
    private int age;
    //性别(1男. 0女)
    private int sex;
    //员工手机号
    private String mobile;
    //密码
    private String password;
    //员工类型(对应EmpType类)
    private Integer empType;
    //部门
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getEmpType() {
        return empType;
    }

    public void setEmpType(Integer empType) {
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
