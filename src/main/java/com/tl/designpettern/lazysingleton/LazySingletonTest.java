package com.tl.designpettern.lazysingleton;

/**
 * @author wangwei
 * @Description
 * @ClassName LazySingletonTest
 * @date 2020/2/15  18:23
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        new Thread(() ->{
            LazySingleton instance3= LazySingleton.getInstance();
            System.out.println(instance3);

        }).start();

        new Thread(() ->{
            LazySingleton instance4= LazySingleton.getInstance();
            System.out.println(instance4);

        }).start();


    }
}

/**@Description  单例模式 懒加载
 * 构造方法私有化
 * @ClassName LazySingleton
 * @author wangwei
 * @date 2020/2/15  18:29
 */
class LazySingleton {

    // volatile 防止指令重排序

    private volatile static LazySingleton instance;

    private LazySingleton() {
    }
    /**@Description 等于空的是时候进行加锁 不为空的话没有必要加锁
     * @Title getInstance
     * @author wangwei
     * @return com.tl.designpettern.lazysingleton.LazySingleton
     * @date 2020/2/15 0015 18:43
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class){
                if(instance==null){
                    instance = new LazySingleton();
                    //字节码层面
                    //jit,cpu
                    // 1:分配空间
                    // 2:初始化
                    // 3:引用赋值
                }
            }

        }
        return instance;
    }
}
