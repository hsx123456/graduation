package com.hsx.service;

import com.hsx.model.Department;

import java.util.List;

/**
 * Created by xing on 18/3/27.
 */
public interface DepartmentService {
    //根据id查询部门
    Department getDeptById(Integer id);
    //查询所有部门
    List<Department> getDeptAll();
}
