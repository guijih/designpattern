package com.tl.factory.abstract1;
/**@Description 抽象的产品工厂
 * @ClassName IProductFactory
 * @author wangwei
 * @date 2020/2/16 0016 18:43
 */
public interface IProductFactory  {

    /**@Description 生产手机
     * @Title iphoneProduct
     * @author wangwei
     * @return com.tl.factory.abstract1.IphoneProduct
     * @date 2020/2/16  18:44
     */
    IphoneProduct iphoneProduct();

    /**@Description 生产路由器
     * @Title iruterProduct
     * @author wangwei
     * @return com.tl.factory.abstract1.IRouterProduct
     * @date 2020/2/16  18:44
     */
    IRouterProduct iRuterProduct();


}
