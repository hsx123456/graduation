package com.hsx.type;

import java.io.Serializable;

/**
 * Created by xing on 18/3/28.
 */
public enum  EmpType {

    General(1,"普通员工"),Manager(2,"管理员");

    private int type;
    private String desc;

    private EmpType(int type, String desc){
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
