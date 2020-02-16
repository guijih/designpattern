package com.tl.factory.method;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new MobilFactory().getCar();
        car.name();
        car1.name();
        car2.name();


    }
}
