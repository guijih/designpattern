package sgg.principle.opc;

/**
 * @author wangwei
 * @Description 开闭原则
 * @ClassName Ocp
 * @date 2020/2/17 0017 14:14
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawRectangle(new Rectangle());
        graphicEditor.drawCircle(new Circle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.type == 1) {
            drawRectangle(new Rectangle());
        }
        if (s.type == 2) {
            drawRectangle(new Circle());
        }
    }

    // 绘制矩形
    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    // 绘制圆形
    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }
}

// shape基类
class Shape {
    int type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
}