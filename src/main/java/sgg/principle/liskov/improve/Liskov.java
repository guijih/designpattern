package sgg.principle.liskov.improve;

/**
 * @author wangwei
 * @Description 里氏替换
 * @ClassName Liskov
 * @date 2020/2/17 0017 12:15
 */
public class Liskov {
    public static void main(String[] args) {

    }
}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的类写到Base类中

}

class A extends Base{
    public int func1(int num1, int num2) {

        return num1 - num2;
    }
}

class B extends Base {
    public int func1(int a, int b) {

        return a + b;
    }

    public int func2(int num1, int num2) {

        return func1(num1, num2) + 9;
    }
}
