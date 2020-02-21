package com.enjoy.structure.decorator;

import com.enjoy.entity.Bag;
/**@Description 这个类和Bag有聚合的关系
 * 还有一种继承的关系
 * @ClassName BagDecorator
 * @author wangwei
 * @date 2020/2/21 0021 13:02
 */
public class BagDecorator implements Bag {
    private Bag bag;  //维持一个对抽象构件对象的引用

    public BagDecorator(Bag bag)  //注入一个抽象构件类型的对象
    {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
