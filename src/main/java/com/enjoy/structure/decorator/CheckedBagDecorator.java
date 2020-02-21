package com.enjoy.structure.decorator;

import com.enjoy.entity.Bag;
/**@Description 具体的装饰者 这个类继承了BagDecorator
 * 加上了防伪标识
 * @ClassName CheckedBagDecorator
 * @author wangwei
 * @date 2020/2/21 0021 13:06
 */
public class CheckedBagDecorator extends BagDecorator {
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        checked();  //打印防伪标识
    }

    //增加防伪标识
    public void checked() {
        System.out.println("------");
        System.out.println("打印上防伪标识");
    }
}
