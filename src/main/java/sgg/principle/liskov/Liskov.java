package sgg.principle.liskov;

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

class A {
    public int func1(int num1, int num2) {

        return num1 - num2;
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {

        return a + b;
    }

    public int func2(int num1, int num2) {

        return func1(num1, num2) + 9;
    }
}
