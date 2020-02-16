package com.tl.factory.abstract1;

public class HuaWeiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("华为");
    }

    @Override
    public void shudown() {

    }

    @Override
    public void callUp() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendSMS() {

    }
}
