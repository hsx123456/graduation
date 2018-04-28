package com.hsx.service;

import com.github.pagehelper.PageInfo;
import com.hsx.model.Device;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by xing on 18/4/11.
 */
public interface DeviceService {
    //查询所有设备
    List<Device> getDevAll();
    //根据分页查询设备
    PageInfo<Device> getDevByPage(Integer pn);
    //添加资产
    Device addDevice(Device device);
    //根据资产类型和状态进行分页查询
    PageInfo<Device> getDevByTypeAndStatus(Integer devType,Integer status,Integer pn);
    //根据资产状态去查询资产
    List<Device> getDevsByStatus(Integer status);
    //通过id查出资产
    Device getDevById(Integer id);
    //根据员工id查询所有资产,分页
    PageInfo<Device> getDevsByempId(Integer empId,Integer pn);
    //根据员工id查询所有资产
    List<Device> getDevsByempId(Integer empId);
    //更新资产
    void updateDev(Device device);
    //将资产分配员工
    void updateDevOnlyEmpId(Device device);
    //根据id删除资产
    void deleteDevById(Integer id);
    //批量删除
    void deleteDevBatch(List<Integer> ids);

}
