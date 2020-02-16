package com.tl.builder;
/**@Description 指挥 核心 负责指挥构建一个工程
 * @ClassName Director
 * @author wangwei
 * @date 2020/2/16 0016 19:30
 */
public class Director  {
    /**@Description 指挥工人按照顺序建造房子
     * @Title build
     * @author wangwei
     * @return com.tl.builder.Product
     * @date 2020/2/16 0016 19:33
     */
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
