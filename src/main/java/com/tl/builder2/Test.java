package com.tl.builder2;


public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        Worker worker2=new Worker();
        String s1 = worker.buildA("1").buildB("2").buildC("3").buildD("4").getProduct().toString();
        String s = worker2.getProduct().toString();
        System.out.println(s);
        System.out.println(s1);


    }
}
