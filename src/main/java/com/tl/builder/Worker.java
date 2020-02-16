package com.tl.builder;
/**@Description 具体的建造者 工人
 * @ClassName Worker
 * @author wangwei
 * @date 2020/2/16 0016 19:27
 */
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product=new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋");
        System.out.println("钢筋");
    }

    @Override
    void buildC() {
        product.setBuildC("电线");
        System.out.println("电线");
    }

    @Override
    void buildD() {
        product.setBuildD("地基");
        System.out.println("地基");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
