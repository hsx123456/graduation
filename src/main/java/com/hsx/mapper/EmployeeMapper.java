package com.hsx.mapper;

import com.hsx.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xing on 18/3/29.
 */
public interface EmployeeMapper {

    //添加一个员工
    Integer addEmployee(Employee employee);
    //根据id获取一个员工
    Employee getEmpById(Integer id);
    //根据部门id获取员工
    List<Employee> getEmpsBydeptId(@Param("did") Integer did);
    //查询所有员工
    List<Employee> getEmpAll();
    //根据手机号查询员工
    Employee getEmpsByMobile(@Param("mobile") String mobile);
    //更新员工
    void updateEmp(Employee employee);
    //修改员工密码
    void updatePasswd(Employee employee);
    //根据id删除员工
    void deleteEmpById(@Param("id") Integer id);
    //批量删除
    void deleteBatch(List<Integer> ids);


}
