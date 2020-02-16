package com.tl.prototype.demo01;

import java.util.Date;
/**@Description 浅克隆
 * @ClassName Video
 * @author wangwei
 * @date 2020/2/16 0016 22:04
 */
public class Video implements Cloneable{

    private String name;

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
