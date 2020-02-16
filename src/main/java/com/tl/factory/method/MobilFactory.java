package com.tl.factory.method;

public class MobilFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mobil();
    }
}
