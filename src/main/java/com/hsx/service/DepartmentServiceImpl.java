package com.hsx.service;

import com.hsx.mapper.DepartmentMapper;
import com.hsx.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xing on 18/3/27.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public Department getDeptById(Integer id) {
        return departmentMapper.getDeptById(id);
    }

    public List<Department> getDeptAll() {
        return departmentMapper.getDeptAll();
    }
}
