package sgg.principle.singleresponslibility.improve;

/**
 * @author wangwei
 * @Description 单一设计原则
 * @ClassName SingleResponslibility
 * @date 2020/2/19  15:13
 */
public class SingleResponslibility3 {
    public static void main(String[] args) {
        VehicleRoad vehicle = new VehicleRoad();
        vehicle.runRoad("摩托车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");

    }
}


/**
 * @author wangwei
 * @Description 交通工具类
 * @ClassName Vehicle
 * @date 2020/2/19 0019 15:24
 */
// 方式2
// 改动很大 类分解 修改客户端
// 直接修改vehicle类 方案3
//
class VehicleRoad {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。。");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "水中运行。。。。");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "空中运行。。。。");
    }
}



