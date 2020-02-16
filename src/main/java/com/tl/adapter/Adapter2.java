package com.tl.adapter;
//2: 组合 (对象适配器 常用)
public class Adapter2 implements NetToUsb{

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    private Adaptee adaptee;

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
