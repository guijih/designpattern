package com.tl.factory.abstract1;

public class Client  {
    public static void main(String[] args) {
        System.out.println("===========小米产品===========");
        XiaoMiFactory xiaoMiFactory=new XiaoMiFactory();
        IphoneProduct iphoneProduct = xiaoMiFactory.iphoneProduct();
        iphoneProduct.callUp();
        IRouterProduct iRouterProduct = xiaoMiFactory.iRuterProduct();
        iRouterProduct.openWife();


        System.out.println("===========华为系列===========");
        HuaWeiFactory huaWeiFactory=new HuaWeiFactory();
        IphoneProduct iphoneProductHuWei = huaWeiFactory.iphoneProduct();
        iphoneProductHuWei.callUp();
        IRouterProduct huaWeiRouter = huaWeiFactory.iRuterProduct();
        huaWeiRouter.openWife();

    }
}
