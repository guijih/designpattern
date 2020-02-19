package sgg.principle.segregate.improve;

/**
 * @author wangwei
 * @Description
 * @ClassName Segregate
 * @date 2020/2/19 0019 16:07
 */
public class Segregate {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
    }
}

interface Interface {
    void operration1();

}

interface InterfaceB {
    void operration2();

    void operration3();


}

interface InterfaceD {

    void operration4();

    void operration5();


}

class B implements Interface, InterfaceB {

    @Override
    public void operration1() {
        System.out.println("b实现了operation1");
    }

    @Override
    public void operration2() {
        System.out.println("b实现了operation2");
    }

    @Override
    public void operration3() {
        System.out.println("b实现了operation3");
    }


}


class D implements Interface, InterfaceD {


    @Override
    public void operration1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operration4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operration5() {
        System.out.println("D实现了operation5");
    }
}

class A { // 通过接口使用了B类 用到了 1 2 3方法
    public void depend1(B i) {
        i.operration1();
    }

    public void depend2(B i) {
        i.operration2();
    }

    public void depend3(B i) {
        i.operration3();
    }

}

class C { // 通过接口使用了B类 用到了 1 2 3方法
    public void depend1(D i) {
        i.operration1();
    }

    public void depend4(D i) {
        i.operration4();
    }

    public void depend5(D i) {
        i.operration5();
    }

}
