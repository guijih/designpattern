package com.tl.builder2;


public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        String s1 = worker.buildA().buildB().buildC().buildD().getProduct().toString();
        String s = worker.getProduct().toString();
        System.out.println(s);
        System.out.println(s1);


    }
}
