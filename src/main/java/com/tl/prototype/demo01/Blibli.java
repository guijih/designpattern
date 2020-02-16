package com.tl.prototype.demo01;

import java.util.Date;

/**@Description 客户端实现clone
 * @ClassName Blibli
 * @author wangwei
 * @date 2020/2/16 0016 21:55
 */
public class Blibli {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型对象 v1
        Date date = new Date();
        Video v1 = new Video("狂神说java", date);
        Video v2=(Video) v1.clone();
        System.out.println(v1);
        System.out.println(v1.hashCode());


        System.out.println("=============");
        date.setTime(22131231);

        // 克隆对象

        System.out.println(v2);
        System.out.println(v2.hashCode());
    }
}
