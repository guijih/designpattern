package com.tl.factory.abstract1;
/**@Description 华为路由器
 * @ClassName HuaWeiRouter
 * @author wangwei
 * @date 2020/2/16 0016 18:40
 */
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {

    }

    @Override
    public void shudown() {

    }

    @Override
    public void openWife() {
        System.out.println("华为打开wife");
    }

    @Override
    public void setting() {

    }
}
