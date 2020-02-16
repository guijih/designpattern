package com.tl.builder2;

public abstract class Builder {

    /**
     * 汉堡
     * @return
     */
    abstract Builder buildA(String msg);
    /**
     * 甜点
     * @return
     */

    abstract Builder buildB(String msg);
    /**
     * 薯条
     * @return
     */

    abstract Builder buildC(String msg);

    /**
     * 可乐
     * @return
     */

    abstract Builder buildD(String msg);

    abstract Product getProduct();
}
