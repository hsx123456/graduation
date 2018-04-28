package com.hsx.type;

/**
 * Created by xing on 18/3/28.
 * 电脑类型
 */
public enum DeviceType {
    Phone(1,"手机"), Computer(2,"电脑"),
    PowerStrip(3,"插线板"),Screen(4,"显示屏"),
    Share(5,"共用资产"),Other(6,"其他类型");

    //类型
    private int type;
    //描述
    private String desc;

    private DeviceType(int type, String desc){
        this.type=type;
        this.desc=desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
