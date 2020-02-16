package com.tl.prototype.demo02;

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
        Video2 v1 = new Video2("狂神说java", date);
        System.out.println(v1);
        System.out.println(v1.hashCode());


        // 克隆对象
        Video2 v2=(Video2) v1.clone();

        date.setTime(22131231);

        System.out.println(v2);
        System.out.println(v2.hashCode());
    }
}
