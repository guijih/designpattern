package com.tl.factory.simple;
/**@Description 消费者 简单工厂模式测试
 * 违背了开闭原则
 * 如果是在增加一辆车的话
 * 得去创建新的车实现车方法
 * 然后去修改工厂创建车的方法
 * @ClassName Consumer
 * @author wangwei
 * @date 2020/2/29 0029 23:45
 */
public class Consumer {
    public static void main(String[] args) {

        CarFactory.getCar("五菱").name();

        CarFactory.getCar("特斯拉").name();



    }
}
