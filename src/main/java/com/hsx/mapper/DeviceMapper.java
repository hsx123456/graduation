package com.hsx.mapper;

import com.hsx.model.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xing on 18/4/11.
 */
public interface DeviceMapper {
    //添加设备
    Integer addDevice(Device device);
    //查询所有资产
    List<Device> getDevAll();
    //根据资产类型和状态查询所有资产
    List<Device> getDevByTypeAndStatus(@Param("devType") Integer devType, @Param("status") Integer status);

    //通过id查出资产
    Device getDevById(Integer id);
    //根据员工id查询所有资产
    List<Device> getDevsByempId(@Param("empId") Integer empId);
    //更新资产
    void updateDev(Device device);
    //将资产分配员工
    void updateDevOnlyEmpId(Device device);
    //根据id删除资产
    void deleteDevById(@Param("id") Integer id);
    //批量删除
    void deleteDevBatch(List<Integer> ids);


}
