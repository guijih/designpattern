package com.tl.adapter;
/**@Description 想上网 连接不上网线
 * @ClassName Computer
 * @author wangwei
 * @date 2020/2/16 0016 22:39
 */
public class Computer {

    public void net(NetToUsb net){
        // 上网的具体实现 找一个转接头
        net.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑 适配器 网线
        Computer computer=new Computer();
        Adaptee adaptee=new Adaptee();
        Adapter adapter=new Adapter();

        Adapter2 adapter2=new Adapter2(adaptee);

        computer.net(adapter2);
    }
}
