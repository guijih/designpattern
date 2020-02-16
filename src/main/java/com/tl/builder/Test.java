package com.tl.builder;

public class Test {
    public static void main(String[] args) {
        // 指挥
        Director direct=new Director();
        // 指挥具体的工人完成产品
        Product build = direct.build(new Worker());
        System.out.println(build.toString());

    }
}
