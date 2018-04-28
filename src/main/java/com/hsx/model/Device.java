package com.hsx.model;

import com.hsx.type.DeviceType;

import java.io.Serializable;

/**
 * Created by xing on 18/3/28.
 * 电脑类
 */
public class Device implements Serializable{

    private Integer id;
    //员工id
    private Employee emp;
    //设备名(如:电脑,手机等)
    private String devName;
    //设备类型
    private Integer devType;
    //价格
    private double price;
    //资产状态(1.使用中 2.未使用且无损坏 3,维修中 4,废弃)
    private int status;
    //坐标x
    private double x;
    //坐标y
    private double y;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
