package sgg.principle.singleresponslibility.improve;

/**
 * @author wangwei
 * @Description 单一设计原则
 * @ClassName SingleResponslibility
 * @date 2020/2/19  15:13
 */
public class SingleResponslibility {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();

        WaterVehicle vehicleWater = new WaterVehicle();
        AirVehicle vehicleAir = new AirVehicle();
        vehicle.run("摩托车");
        vehicleWater.run("轮船");
        vehicleAir.run("飞机");

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
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。。");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "空中运行。。。。");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行。。。。");
    }
}