package com.enjoy.structure.decorator;

import com.enjoy.entity.Bag;
/**@Description SpeedDecorator继承了 BagDecorator
 * @ClassName SpeedDecorator
 * @author wangwei
 * @date 2020/2/21 0021 13:25
 */
public class SpeedDecorator extends BagDecorator {
    public SpeedDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        speedy();
    }

    //快件加急
    public void speedy() {
        System.out.println("------");
        System.out.println("打上加急标识");
    }
}
