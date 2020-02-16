package com.tl.factory.simple;
// 开闭原则 修改关闭
public class CarFactory {
    public static Car getCar(String car){
        if("五菱".equals(car)){
            return new WuLing();
        }
        else if("特斯拉".equals(car)){
            return new Tesla();
        }else{
            return null;
        }
    }
}
