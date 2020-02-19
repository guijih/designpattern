package sgg.principle.singleresponslibility;

/**
 * @author wangwei
 * @Description 单一设计原则
 * @ClassName SingleResponslibility
 * @date 2020/2/19  15:13
 */
public class SingleResponslibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}


/**
 * @author wangwei
 * @Description 交通工具类
 * @ClassName Vehicle
 * @date 2020/2/19 0019 15:24
 */
// 方式1
// 违反了单一职责原则
//
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。。");
    }
}
