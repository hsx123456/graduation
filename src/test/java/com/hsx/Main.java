package com.hsx;

import com.hsx.model.Department;
import com.hsx.model.Device;
import com.hsx.model.Employee;
import com.hsx.service.DepartmentService;
import com.hsx.service.DeviceService;
import com.hsx.service.EmployeeService;
import com.hsx.type.EmpType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xing on 18/3/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-root.xml","classpath*:/application-service.xml"})
public class Main {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DeviceService deviceService;
    @Test
    public void test(){
        List<Device> devices=deviceService.getDevAll();
        System.out.println(devices);
    }



}
