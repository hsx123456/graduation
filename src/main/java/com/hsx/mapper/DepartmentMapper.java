package com.hsx.mapper;

import com.hsx.model.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xing on 18/3/27.
 */
public interface DepartmentMapper {
    //根据id查询部门
    Department getDeptById(Integer id);
    //查询所有部门
    List<Department> getDeptAll();
}
