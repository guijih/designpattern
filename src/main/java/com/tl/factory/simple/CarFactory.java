package com.tl.factory.simple;
// 开闭原则 修改关闭
/**@Description 违背了开闭原则
 * @ClassName CarFactory
 * @author wangwei
 * @date 2020/2/29 0029 23:47
 */
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
