package com.tl.factory.abstract1;
/**@Description 小米手机
 * @ClassName XiaoMiPhone
 * @author wangwei
 * @date 2020/2/16 0016 18:38
 */
public class XiaoMiPhone implements IphoneProduct {
    @Override
    public void start() {

    }

    @Override
    public void shudown() {

    }

    @Override
    public void callUp() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSMS() {

    }
}
