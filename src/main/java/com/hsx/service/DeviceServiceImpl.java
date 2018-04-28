package com.hsx.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hsx.mapper.DeviceMapper;
import com.hsx.model.Device;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.List;

/**
 * Created by xing on 18/4/11.
 */
@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    public List<Device> getDevAll() {
        return deviceMapper.getDevAll();
    }

    public PageInfo<Device> getDevByPage(Integer pn) {
        PageHelper.startPage(pn,5);
        List<Device> devices=deviceMapper.getDevAll();
        PageInfo<Device> pageInfo=new PageInfo<Device>(devices,5);
        return pageInfo;
    }

    public Device addDevice(Device device) {
        Device device1=device;
        Integer integer=deviceMapper.addDevice(device1);
        if (integer!=null&&integer.intValue()>0){
            return device1;
        }
        return null;
    }

    public PageInfo<Device> getDevByTypeAndStatus(Integer devType, Integer status, Integer pn) {
        PageHelper.startPage(pn,5);
        List<Device> devices=deviceMapper.getDevByTypeAndStatus(devType,status);
        PageInfo<Device> pageInfo=new PageInfo<Device>(devices,5);
        return pageInfo;
    }

    public List<Device> getDevsByStatus(Integer status) {
        return deviceMapper.getDevByTypeAndStatus(null,status);
    }

    public Device getDevById(Integer id) {
        return deviceMapper.getDevById(id);
    }

    public PageInfo<Device> getDevsByempId(Integer empId,Integer pn) {
        PageHelper.startPage(pn,5);
        List<Device> list=deviceMapper.getDevsByempId(empId);
        PageInfo<Device> pageInfo=new PageInfo<Device>(list,5);
        return pageInfo;
    }

    public List<Device> getDevsByempId(Integer empId) {
        return deviceMapper.getDevsByempId(empId);
    }

    public void updateDev(Device device) {
        deviceMapper.updateDev(device);
    }

    public void updateDevOnlyEmpId(Device device) {
        deviceMapper.updateDevOnlyEmpId(device);
    }

    public void deleteDevById(Integer id) {
        deviceMapper.deleteDevById(id);
    }

    public void deleteDevBatch(List<Integer> ids) {
        deviceMapper.deleteDevBatch(ids);
    }


}
