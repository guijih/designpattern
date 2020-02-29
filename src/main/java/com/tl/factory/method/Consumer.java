package com.tl.factory.method;
/**@Description 工厂方法模式
 * 在简答工厂模式的前提下 增加了工厂抽象
 * 添加新的车时候添加新的工厂和车辆即可
 * 符合开闭原则
 * @ClassName Consumer
 * @author wangwei
 * @date 2020/3/1 0001 0:06
 */
public class Consumer {
    public static void main(String[] args) {


        CarFactory factory=new MobilFactory();
        factory.getCar().name();

        CarFactory tesla=new TeslaFactory();
        tesla.getCar().name();






    }
}
