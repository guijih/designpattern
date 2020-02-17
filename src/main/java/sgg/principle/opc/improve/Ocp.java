package sgg.principle.opc.improve;

/**
 * @author wangwei
 * @Description 开闭原则
 * @ClassName Ocp
 * @date 2020/2/17 0017 14:14
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
       s.draw();
    }
}

// shape基类
abstract class Shape {
    int type;

    public abstract  void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}