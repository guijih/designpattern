package com.tl.prototype.demo02;

import java.util.Date;

public class Video2 implements Cloneable{

    private String name;

    public Video2(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();

        // 实现深克隆
        Video2 v=(Video2)obj;
        v.createTime=(Date)this.createTime.clone();

        return obj;
    }

    private Date createTime;

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
