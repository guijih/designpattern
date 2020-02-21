package com.enjoy.structure.decorator;

import com.enjoy.entity.Bag;
/**@Description 加固包装
 * @ClassName ReinforceBagDecorator
 * @author wangwei
 * @date 2020/2/21 0021 13:26
 */
public class ReinforceBagDecorator extends BagDecorator {
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        reinforce();
    }

    //加固包装
    public void reinforce() {
        System.out.println("------");
        System.out.println("加固了包装");
    }
}
